package br.com.itau.ecommerce.service.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import br.com.itau.ecommerce.model.*;
import br.com.itau.ecommerce.repository.CartRepository;
import br.com.itau.ecommerce.repository.OrderRepository;
import br.com.itau.ecommerce.repository.ProductInOrderRepository;
import br.com.itau.ecommerce.repository.UserRepository;
import org.assertj.core.api.Java6Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl service;

    @InjectMocks
    ProductServiceImpl productService;

    @Mock
    UserRepository repository;

    @Mock
    CartRepository cartRepository;

    @Mock
    OrderRepository orderRepository;

    @Mock
    ProductInOrderRepository productInOrderRepository;

    private Cart cart;

    private ProductInOrder productInOrder;

    private ProductInfo productInfo;

    private PasswordEncoder passwordEncoder;

    private User user;
    @BeforeEach
    void setUp() {
        BigDecimal expectedAmount = new BigDecimal("34.12");

        productInfo = new ProductInfo();
        productInfo.setProductId("C0002");
        productInfo.setProductStatus(2);
        productInfo.setProductStock(2);
        productInfo.setProductName("camisa");
        productInfo.setProductPrice(expectedAmount);
        productInfo.setCategoryType(2);

        productInOrder = new ProductInOrder();
        productInOrder.setId(1l);
        productInOrder.setCategoryType(2);
        productInOrder.setProductId("1");

        cart = new Cart();
        cart.setCartId(1L);


        user = new User();
        user.setId(1L);
        user.setEmail("customer1@email.com");
        user.setPassword("123");
        user.setCart(cart);
        user.setName("Lucas");
        user.setPhone("111111");
        user.setActive(true);
        user.setRole("ROLE_CUSTOMER");


    }
    @Test
    public void testSave() {


    }

    @Test
    public void testUpdate() {


    }

}
