package com.apredendoeduca.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apredendoeduca.course.entities.User;
import com.apredendoeduca.course.services.UserService;

@RestController
@RequestMapping(value = "/users") // a partir do path padrão a url para acesso a este recurso
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping  //informo que esse endpoint é um get
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findyById(id);
		return ResponseEntity.ok(obj);
	}
	
}
