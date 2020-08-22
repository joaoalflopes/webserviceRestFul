package com.jboyCorp.webserviceRestFul;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jboyCorp.webserviceRestFul.domain.Category;
import com.jboyCorp.webserviceRestFul.domain.Product;
import com.jboyCorp.webserviceRestFul.repositories.CategoryRepository;
import com.jboyCorp.webserviceRestFul.repositories.ProductRepository;

@SpringBootApplication
public class WebserviceRestFulApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	

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
		
		Product p1 = new Product(null, "Jelly Comb 2.4G Slim Wireless Mouse with Nano Receiver", 11.99);
		Product p2 = new Product(null, "Mpow HC6 USB Headset with Microphone, Comfort-fit Office Computer Headphone", 36.90);
		Product p3 = new Product(null, "Samsung Galaxy Buds+ Plus, True Wireless Earbuds (Wireless Charging Case included)", 149.99);
		Product p4 = new Product(null, "Car Vacuum, HOTOR Corded Car Vacuum Cleaner High Power for Quick Car Cleaning, DC 12V ", 25.49);
		Product p5 = new Product(null, "ZippyPaws - Skinny Peltz No Stuffing Squeaky Plush Dog Toy", 9.80);
		Product p6 = new Product(null, "Kaspersky Internet Security 2020,3 Devices,1 Year,PC/Mac/Android ", 36.99);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat4.getProducts().addAll(Arrays.asList(p2, p3));
		cat10.getProducts().add(p4);
		cat7.getProducts().add(p5);
		cat5.getProducts().add(p6);
		
		p1.getCategories().add(cat1);
		p2.getCategories().addAll(Arrays.asList(cat1, cat4));
		p3.getCategories().addAll(Arrays.asList(cat1, cat4));
		p4.getCategories().add(cat10);
		p5.getCategories().add(cat7);
		p6.getCategories().add(cat5);
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
	}

}
