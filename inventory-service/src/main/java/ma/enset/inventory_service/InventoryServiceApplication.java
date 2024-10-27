package ma.enset.inventory_service;

import ma.enset.inventory_service.Repository.ProdcutRepository;
import ma.enset.inventory_service.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProdcutRepository prodcutRepository, RepositoryRestConfiguration rdv){
		rdv.exposeIdsFor(Product.class);
		return args -> {
			prodcutRepository.save(new Product(null,"PC", 7400,10));
			prodcutRepository.save(new Product(null,"LAPTOP", 5000,15));
			prodcutRepository.save(new Product(null,"PHONE", 2000,21));
		};
	}
}
