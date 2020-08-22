package com.jboyCorp.webserviceRestFul;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jboyCorp.webserviceRestFul.domain.Category;
import com.jboyCorp.webserviceRestFul.repositories.CategoryRepository;

@SpringBootApplication
public class WebserviceRestFulApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(WebserviceRestFulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Category cat1 = new Category(null, "Computers");
		Category cat2 = new Category(null, "Girls' Fashion");
		Category cat3 = new Category(null, "Boys' Fashion");
		Category cat4 = new Category(null, "Electronics");
		Category cat5 = new Category(null, "Software");
		Category cat6 = new Category(null, "Arts & Crafts");
		Category cat7 = new Category(null, "Pet Supplies");
		Category cat8 = new Category(null, "Video Games");
		Category cat9 = new Category(null, "Home & Kitchen");
		Category cat10 = new Category(null, "Automotive");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10));
		
	}

}
