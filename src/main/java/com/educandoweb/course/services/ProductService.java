package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

//@Component//registra a classe como componente do springboot
@Service//é a mesma coisa que o component mas a palavra é semanticamente melhor
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	public List<Product>findAll(){
		
		return repository.findAll();
	}
}
