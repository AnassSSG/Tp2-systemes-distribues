package ma.enset.inventory_service.Repository;

import ma.enset.inventory_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProdcutRepository extends JpaRepository<Product, Long> {

}
