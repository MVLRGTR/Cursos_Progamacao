package com.apredendoeduca.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apredendoeduca.course.entities.Product;
import com.apredendoeduca.course.repositories.ProductRepository;

@Service //registro no spring uma camda de serviço
public class ProductService {
	
	@Autowired // faz a injeçao de dependencia de forma transparente ao progamador 
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findyById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
