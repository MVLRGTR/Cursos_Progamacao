package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;


public class Progam {

	public static void main(String[] args) {
		Connection conn =null;
		Statement st = null;
		
		/*
		 * Aqui fazemos a demostração de uma falha ao executar uma query no banco de dados e como resolver isso
		 * O código aplica dois comandos , só que no meio lanço um fake erro fazendo que somente uma query seja aplicada
		 * então utilizamos o conn.setAutoCommit(false) para que essa comfirmação tenha que ser feita pelo progamador delimitando
		 * o bloco a ser auditado com o final conn.commit().  
		 * caso não ocorra a confirmação o banco volta ao que era antes com o comando ;
		 * */
	
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller set BaseSalary = 2090 WHERE DepartmentId = 1");
			
			/*int x = 1;
			if(x<2) {
				throw new SQLException("Fake Error");
			}
			*/
			int rows2 = st.executeUpdate("UPDATE seller set BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();
			
			System.out.println("rows 1 " + rows1);
			System.out.println("rows 2 " + rows2);
		}catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back ! Caused by: "+ e.getMessage() );
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by :"+e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
	}
}
