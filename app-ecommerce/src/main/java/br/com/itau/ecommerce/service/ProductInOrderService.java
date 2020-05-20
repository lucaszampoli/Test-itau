package br.com.itau.ecommerce.service;

import br.com.itau.ecommerce.model.ProductInOrder;
import br.com.itau.ecommerce.model.User;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
