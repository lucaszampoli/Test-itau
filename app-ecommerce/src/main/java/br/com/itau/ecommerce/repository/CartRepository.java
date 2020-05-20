package br.com.itau.ecommerce.repository;

import br.com.itau.ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
