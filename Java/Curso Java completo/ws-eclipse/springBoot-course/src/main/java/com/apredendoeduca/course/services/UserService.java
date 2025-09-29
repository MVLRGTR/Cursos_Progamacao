package com.apredendoeduca.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.apredendoeduca.course.entities.User;
import com.apredendoeduca.course.repositories.UserRepository;
import com.apredendoeduca.course.services.exceptions.DatabaseException;
import com.apredendoeduca.course.services.exceptions.ResourceNotFoundException;

@Service //registro no spring uma camda de serviço
public class UserService {
	
	@Autowired // faz a injeçao de dependencia de forma transparente ao progamador 
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findyById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id)); // caso o objeto não exista eu faço o lançamento de exceção  ResourceNotFoundException
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		try {
			Optional<User> obj = repository.findById(id);
			obj.orElseThrow(()-> new ResourceNotFoundException(id));
			repository.deleteById(id);
		}catch (ResourceNotFoundException  e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id ,User user) {
		User entity = repository.getReferenceById(id);  //isso aqui faz com que o jpa faça a referenciação ao objeto sem precisar fazer a consulta no banco\
		updateData(entity,user);
		return repository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}

}
