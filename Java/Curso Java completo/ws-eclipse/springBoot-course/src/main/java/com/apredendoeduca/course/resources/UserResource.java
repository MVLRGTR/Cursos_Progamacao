package com.apredendoeduca.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<User> insertUser(@RequestBody User obj){ //faço essa anotação para informa ao spring que o obj chega em json e precisa ser deserializado
		obj = service.insert(obj);
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); //isso serve para que na resposta 201 eu informe onde esse recurso foi criado
		return ResponseEntity.created(uri).body(obj);
	}
}
