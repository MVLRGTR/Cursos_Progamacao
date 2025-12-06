package com.apredendoeduca.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apredendoeduca.course.entities.Product;
import com.apredendoeduca.course.services.ProductService;

@RestController
@RequestMapping(value = "/products") // a partir do path padrão a url para acesso a este recurso
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping  //informo que esse endpoint é um get
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findyById(id);
		return ResponseEntity.ok(obj);
	}
	
}
