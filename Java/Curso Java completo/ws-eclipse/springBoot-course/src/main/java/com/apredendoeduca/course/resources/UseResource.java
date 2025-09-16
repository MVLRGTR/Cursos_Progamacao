package com.apredendoeduca.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apredendoeduca.course.entities.User;

@RestController
@RequestMapping(value = "/users") // a partir do path padrão a url para acesso a este recurso
public class UseResource {
	
	@GetMapping  //informo que esse endpoint é um get
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","33456987","maria12345");
		return ResponseEntity.ok().body(u);
	}
	
}
