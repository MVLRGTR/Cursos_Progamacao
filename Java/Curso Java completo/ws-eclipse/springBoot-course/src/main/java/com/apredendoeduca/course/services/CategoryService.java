package com.apredendoeduca.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apredendoeduca.course.entities.Category;
import com.apredendoeduca.course.repositories.CategoryRepository;

@Service //registro no spring uma camda de serviço
public class CategoryService {
	
	@Autowired // faz a injeçao de dependencia de forma transparente ao progamador 
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findyById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
