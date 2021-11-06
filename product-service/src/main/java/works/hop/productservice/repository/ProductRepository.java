package works.hop.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import works.hop.productservice.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByName(String name);
}
