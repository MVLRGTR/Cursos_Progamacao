package application;

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
		
		System.out.println("===== Test 1 findById = 3 =====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===== Test findByDeparment = 2 =====");
		List<Seller> listSellerDepartment = new ArrayList<>();
		listSellerDepartment = sellerDao.findByDepartment(new Department(2,"Electronics"));
		for(Seller sl : listSellerDepartment) {
			System.out.println(sl.toString());
		}
		
	}
}
