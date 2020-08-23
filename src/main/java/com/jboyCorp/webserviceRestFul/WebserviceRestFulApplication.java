package com.jboyCorp.webserviceRestFul;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jboyCorp.webserviceRestFul.domain.Address;
import com.jboyCorp.webserviceRestFul.domain.Category;
import com.jboyCorp.webserviceRestFul.domain.City;
import com.jboyCorp.webserviceRestFul.domain.Client;
import com.jboyCorp.webserviceRestFul.domain.Product;
import com.jboyCorp.webserviceRestFul.domain.State;
import com.jboyCorp.webserviceRestFul.domain.enums.TypeClient;
import com.jboyCorp.webserviceRestFul.repositories.AddressRepository;
import com.jboyCorp.webserviceRestFul.repositories.CategoryRepository;
import com.jboyCorp.webserviceRestFul.repositories.CityRepository;
import com.jboyCorp.webserviceRestFul.repositories.ClientRepository;
import com.jboyCorp.webserviceRestFul.repositories.ProductRepository;
import com.jboyCorp.webserviceRestFul.repositories.StateRepository;

@SpringBootApplication
public class WebserviceRestFulApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	

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
		
		State st1 = new State(null, "Sao Paulo", "SP");
		State st2 = new State(null, "Rio de Janeiro", "RJ");
		State st3 = new State(null, "Minas Gerais", "MG");
		
		City cit1 = new City(null, "Santos", st1);
		City cit2 = new City(null, "Campinas", st1);
		City cit3 = new City(null, "Petropolis", st2);
		City cit4 = new City(null, "Belo Horizonte", st3);
		City cit5 = new City(null, "Angra dos Reis", st2);
		City cit6 = new City(null, "Poços de Calda", st3);
		City cit7 = new City(null, "São Vicente", st1);
		
		st1.getCities().addAll(Arrays.asList(cit1, cit2));
		st2.getCities().addAll(Arrays.asList(cit3, cit5));
		st3.getCities().addAll(Arrays.asList(cit4, cit6));
		
		stateRepository.saveAll(Arrays.asList(st1, st2, st3));
		cityRepository.saveAll(Arrays.asList(cit1, cit2, cit3, cit4, cit5, cit6, cit7));
		
		Client cli1 = new Client(null, "Maria Helena P.Lopes", "mariahelen@gmail.com", "07210559488", TypeClient.PESSOAFISICA);
		Client cli2 = new Client(null, "Joao Alfredo P.Lopes", "joaoalfredo_lopes@yahoo.com.br", "08769488835", TypeClient.PESSOAFISICA);
		Client cli3 = new Client(null, "Simoes & Barreira SC Ltda", "simoesbarra@gmail.com", "05755751000131", TypeClient.PESSOAJURIDICA);
		
		cli1.getPhones().addAll(Arrays.asList("13991138797", "1332281406"));
		cli2.getPhones().addAll(Arrays.asList("13991236336", "13981328480"));
		cli3.getPhones().addAll(Arrays.asList("1332281809", "1332281810"));
		
		Address addrs1 = new Address(null, "Rua Anadir Dias de Carvalho", "586", "Casa", "Joquei Clube", "11450-515", cli1, cit7);
		Address addrs2 = new Address(null, "Rua Governador Pedro de Toledo", "56", "Apto 95", "Boqueirao", "11045-550", cli2, cit1);
		Address addrs3 = new Address(null, "Rua Anadir Dias de Carvalho", "586", "-", "Joquei Clube", "11450-515", cli2, cit7);
		Address addrs4 = new Address(null, "Avenida Dona Ana Costa", "413", "Conj.45", "Gonzaga", "11230-101", cli3, cit1);
		
		
		cli1.getAdresses().addAll(Arrays.asList(addrs1));
		cli2.getAdresses().addAll(Arrays.asList(addrs2, addrs3));
		cli3.getAdresses().addAll(Arrays.asList(addrs4));
		
		
		clientRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		addressRepository.saveAll(Arrays.asList(addrs1, addrs2, addrs3, addrs4));

	}

}
