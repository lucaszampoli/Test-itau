package br.com.itau.ecommerce.service;


import br.com.itau.ecommerce.model.User;

import java.util.Collection;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
