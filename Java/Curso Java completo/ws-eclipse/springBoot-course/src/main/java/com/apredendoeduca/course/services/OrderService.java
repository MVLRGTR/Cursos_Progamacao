package com.apredendoeduca.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apredendoeduca.course.entities.Order;
import com.apredendoeduca.course.repositories.OrderRepository;

@Service //registro no spring uma camada de serviço
public class OrderService {
	
	@Autowired // faz a injeçao de dependencia de forma transparente ao progamador 
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findyById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
