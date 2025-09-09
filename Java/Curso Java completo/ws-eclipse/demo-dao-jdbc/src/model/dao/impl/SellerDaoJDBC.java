package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
	
	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller seller) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+"(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+"VALUES "
					+"(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS
					);
			st.setString(1,seller.getName());
			st.setString(2,seller.getEmail());
			st.setDate(3, java.sql.Date.valueOf(seller.getBirthDate()));
			st.setDouble(4, seller.getBaseSalary());
			st.setInt(5, seller.getDepartment().getId());
			int rowsAffected = st.executeUpdate();
			
			
			if(rowsAffected > 0) {
				rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					seller.setId(id);
					System.out.println("Done !!! Id = "+ id);
				}
			}else {
				System.out.println("No rows affected !!!");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void update(Seller seller) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "
					+"SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+"WHERE Id = ?"
					);
			st.setString(1,seller.getName());
			st.setString(2,seller.getEmail());
			st.setDate(3, java.sql.Date.valueOf(seller.getBirthDate()));
			st.setDouble(4, seller.getBaseSalary());
			st.setInt(5, seller.getDepartment().getId());
			st.setInt(6,seller.getId());
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("Done !!! Id = "+ seller.getId()+" has been modificade");
			}else {
				System.out.println("No rows affected !!!");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM seller "
					+"WHERE Id = ?"
					);
			st.setInt(1, id);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("Done !!! Id = "+ id+" has been delete");
			}else {
				System.out.println("No rows affected !!!");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st =null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "+
					"FROM seller INNER JOIN department "+
					"ON seller.DepartmentId = department.Id "+
					"WHERE seller.Id = ?"
					);
			st.setInt(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				
				Seller seller = instantiateSeller(rs, instantiateDepartment(rs));
				
				return seller;
			}
			return null;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
	public Department instantiateDepartment(ResultSet rs) throws SQLException{
		Department dep = new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
	}
	
	public Seller instantiateSeller(ResultSet rs,Department dp) throws SQLException{
		DateTimeFormatter fmtBanco = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dataDoBanco = rs.getString("BirthDate");
		LocalDateTime dataHora = LocalDateTime.parse(dataDoBanco, fmtBanco);
        LocalDate dataApenas = dataHora.toLocalDate();
		
		Seller seller = new Seller();
		seller.setId(rs.getInt("Id"));
		seller.setName(rs.getString("Name"));
		seller.setEmail(rs.getString("Email"));
		seller.setBirthDate(dataApenas);
		seller.setBaseSalary(rs.getDouble("BaseSalary"));
		seller.setDepartment(dp);
		
		return seller;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+"FROM seller INNER JOIN department "
					+"ON seller.DepartmentId = department.Id "
					+"ORDER BY Name"
					);
			rs = st.executeQuery();
			
			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>();
				
			while(rs.next()) {
				Department departmenti = map.get(rs.getInt("DepartmentId")); // caso o objeto ainda não tenha sido instanciado isso aqui return null e o if entrara em ação
				
				if(departmenti == null) {
					departmenti = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), departmenti);
				}
				
				Seller seller = instantiateSeller(rs, departmenti);
				list.add(seller);
			}
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st =null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+"FROM seller INNER JOIN department "
					+"ON seller.DepartmentId = department.Id "
					+"WHERE DepartmentId = ? "
					+"ORDER BY Name"
					);
			st.setInt(1, department.getId());
			rs = st.executeQuery();
			
			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>();
			
			/*Utilizamos o map para poder fazer a instanciação apenas se o objeto department ainda não existir 
			 * Essa é um forma um pouco mais elaborada , mas que também pode ser feita por um if ou contador para isso
			*/
			
			
			
			while(rs.next()) {
				Department departmenti = map.get(rs.getInt("DepartmentId")); // caso o objeto ainda não tenha sido instanciado isso aqui return null e o if entrara em ação
				
				if(departmenti == null) {
					departmenti = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), departmenti);
				}
				
				Seller seller = instantiateSeller(rs, departmenti);
				list.add(seller);
			}
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	

}
