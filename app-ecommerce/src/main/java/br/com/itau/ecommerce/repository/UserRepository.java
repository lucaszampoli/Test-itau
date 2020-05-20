package br.com.itau.ecommerce.repository;


import br.com.itau.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);

}
