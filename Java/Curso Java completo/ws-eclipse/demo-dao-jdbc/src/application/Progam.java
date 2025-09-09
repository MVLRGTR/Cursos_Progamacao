package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		
		/*
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("27/03/1995",fmt1);
		Department obj = new Department(1,"Book");
		Seller sl = new Seller(21,"joao","joaoseller@gmail.com",date,3600.0,obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(obj);
		System.out.println(sl);
		*/
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String birthDate = "05/02/2002";
		LocalDate birthDateInsert = LocalDate.parse(birthDate,fmt1);
		
		System.out.println("===== Test 1 findById = 3 =====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("===== Test 2 findByDeparment = 2 =====");
		List<Seller> listSellerDepartment = new ArrayList<>();
		listSellerDepartment = sellerDao.findByDepartment(new Department(2,"Electronics"));
		for(Seller sl : listSellerDepartment) {
			System.out.println(sl.toString());
		}
		
		System.out.println();
		
		System.out.println("===== Teste 3 Insert =====");
		sellerDao.insert(new Seller(0,"Luiz Alberto Gonzaga Mendes","luizgonzaga2@gamil.com",birthDateInsert,3500.00,new Department(2,"All")));
		
		System.out.println();
		
		System.out.println("===== Teste 4 Update =====");
		Seller sellerUpdate = sellerDao.findById(12);
		sellerUpdate.setName("Luiz Carlos Alberto de Nobrega Castilho");
		sellerDao.update(sellerUpdate);
		
		System.out.println();
		
		System.out.println("===== Teste 5 Delete =====");
		Seller sellerDelete = sellerDao.findById(24);
		if(sellerDelete != null) {
			sellerDao.deleteById(sellerDelete.getId());
		}else {
			System.out.println("O objeto não existe no banco de dados !!!");
		}
		
		System.out.println();
		
		System.out.println("===== Test 6 findAll =====");
		List<Seller> listAllSeller = new ArrayList<Seller>();
		listAllSeller = sellerDao.findAll();
		for(Seller sl : listAllSeller) {
			System.out.println(sl.toString());
		}
		
	}
}
