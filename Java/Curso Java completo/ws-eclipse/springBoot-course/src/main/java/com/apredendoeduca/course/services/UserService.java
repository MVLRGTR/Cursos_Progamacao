package com.apredendoeduca.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apredendoeduca.course.entities.User;
import com.apredendoeduca.course.repositories.UserRepository;

@Service //registro no spring uma camda de serviço
public class UserService {
	
	@Autowired // faz a injeçao de dependencia de forma transparente ao progamador 
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findyById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
