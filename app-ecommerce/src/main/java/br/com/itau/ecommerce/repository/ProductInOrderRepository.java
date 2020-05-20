package br.com.itau.ecommerce.repository;

import br.com.itau.ecommerce.model.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
