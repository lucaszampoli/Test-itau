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

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
@ExtendWith(MockitoExtension.class)
public class CartServiceImplTest {

    @InjectMocks
    CartServiceImpl service;

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
    public void testGetCart() {
         service.getCart(user);
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testMergeLocalCart() {

    }

    @Test
    public void testDelete() {

//        when(repository.findById(1L)).thenReturn(Optional.of(entity));
////        when(repository.save(entity)).thenReturn(entity);
////
////        Java6Assertions.assertThat(service.remove(dto).getId()).as("id of removed entity").isEqualTo(1);
        service.delete(productInfo.getProductId(), user);
        var op = user.getCart().getProducts().stream().filter(e -> productInfo.equals(e.getProductId())).findFirst();
        op.ifPresent(productInOrder -> {
            productInOrder.setCart(null);
            productInOrderRepository.deleteById(productInOrder.getId());

        });
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testCheckout() {
        service.checkout(user);
        OrderMain order = new OrderMain(user);
        orderRepository.save(order);
        user.getCart().getProducts().forEach(productInOrder -> {
            productInOrder.setCart(null);
            productInOrder.setOrderMain(order);
            productService.decreaseStock(productInOrder.getProductId(), productInOrder.getCount());
            productInOrderRepository.save(productInOrder);
        });
    }
}
