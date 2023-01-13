package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

//@Component//registra a classe como componente do springboot
@Service//é a mesma coisa que o component mas a palavra é semanticamente melhor
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	public List<Order>findAll(){
		
		return repository.findAll();
	}
}
