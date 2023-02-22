package com.api.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.myfirstproject.model.Category;
import com.api.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepo.save(cat1);
		categoryRepo.save(cat2);
	}

}
