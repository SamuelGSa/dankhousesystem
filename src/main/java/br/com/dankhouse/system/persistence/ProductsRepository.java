package br.com.dankhouse.system.persistence;

import br.com.dankhouse.system.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Long> {
}
