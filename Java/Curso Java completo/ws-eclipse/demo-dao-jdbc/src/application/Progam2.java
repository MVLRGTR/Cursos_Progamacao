package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Progam2 {

	public static void main(String[] args) {
		System.out.println("===== Test 1 insert  =====");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(new Department(0,"General Services"));
		
		System.out.println();
		
		System.out.println("===== Test 2 Update  =====");
		departmentDao.update(new Department(5,"General administration "));
		
		System.out.println();
		
		System.out.println("===== Test 3 Delete  =====");
		departmentDao.deleteById(10);
		
		System.out.println();
		
		System.out.println("===== Test 4 FindById 3  =====");
		Department dp = departmentDao.findById(3);
		System.out.println(dp.toString());
		
		System.out.println();
		
		System.out.println("===== Test 5 FindAll =====");
		List<Department> listDepartment = departmentDao.findAll();
		for(Department dplist : listDepartment) {
			System.out.println(dplist.toString());
		}

	}

}
