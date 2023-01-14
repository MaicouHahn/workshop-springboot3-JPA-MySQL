package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

//@Component//registra a classe como componente do springboot
@Service//é a mesma coisa que o component mas a palavra é semanticamente melhor
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	public List<Category>findAll(){
		
		return repository.findAll();
	}
}
