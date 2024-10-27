package ma.enset.customer_service;

import ma.enset.customer_service.entities.Customer;
import ma.enset.customer_service.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration rsc){
		rsc.exposeIdsFor(Customer.class);
		return args -> {
			customerRepository.save(new Customer(null,"anass", "anassboujendar8@gmail.com"));
			customerRepository.save(new Customer(null,"walid", "walidboujendar22@gmail.com"));
			customerRepository.save(new Customer(null,"malak", "malakboujendar5@gmail.com"));
		};
}
}