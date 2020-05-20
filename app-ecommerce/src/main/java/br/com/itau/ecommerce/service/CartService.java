package br.com.itau.ecommerce.service;

import br.com.itau.ecommerce.model.Cart;
import br.com.itau.ecommerce.model.ProductInOrder;
import br.com.itau.ecommerce.model.User;

import java.util.Collection;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
