package br.com.itau.ecommerce.service.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import br.com.itau.ecommerce.domain.OrderStatusEnum;
import br.com.itau.ecommerce.domain.ResultEnum;
import br.com.itau.ecommerce.handler.MyException;
import br.com.itau.ecommerce.model.*;
import br.com.itau.ecommerce.repository.*;
import br.com.itau.ecommerce.service.ProductService;
import org.assertj.core.api.Java6Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
@ExtendWith(MockitoExtension.class)
public class OrderServiceImplTest {

    @InjectMocks
    OrderServiceImpl orderService;


    @Mock
    OrderRepository repository;

    @Mock
    UserRepository userRepository;

    @Mock
    ProductInfoRepository productInfoRepository;


    @Mock
    ProductInOrderRepository productInOrderRepository;

    private Cart cart;

    private ProductInOrder productInOrder;

    private ProductInfo productInfo;

    private User user;

    @Mock
    private Pageable pageableMock;


    private OrderMain orderMain;

    private static final Long ID = 1L;

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

        orderMain = new OrderMain();
        orderMain.setOrderId(1l);
        orderMain.setOrderStatus(1);
        orderMain.setBuyerAddress("rua marte");
        orderMain.setBuyerEmail("customer1@email.com");
        orderMain.setBuyerName("Lucas");
    }

    @Test
    public void testFindAll() {
        Page<OrderMain> pagination = Mockito.mock(Page.class);

        when(orderService.findAll(pageableMock)).thenReturn((pagination));
        repository.findAllByOrderByOrderStatusAscCreateTimeDesc(pageableMock);
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testFindByStatus() {
        Page<OrderMain> pagination = Mockito.mock(Page.class);

        when(orderService.findByStatus(productInfo.getProductStatus(),pageableMock)).thenReturn((pagination));
        repository.findAllByOrderStatusOrderByCreateTimeDesc(productInfo.getProductStatus(),pageableMock);
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testFindByBuyerEmail() {
        Page<OrderMain> pagination = Mockito.mock(Page.class);

        when(orderService.findByBuyerEmail("customer1@email.com",pageableMock)).thenReturn((pagination));
        repository.findAllByBuyerEmailOrderByOrderStatusAscCreateTimeDesc("customer1@email.com",pageableMock);
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testFindByBuyerPhone() {
        Page<OrderMain> pagination = Mockito.mock(Page.class);

        when(orderService.findByBuyerPhone("111111",pageableMock)).thenReturn((pagination));
        repository.findAllByBuyerPhoneOrderByOrderStatusAscCreateTimeDesc("111111",pageableMock);
        Assert.assertTrue(1 < 10);
    }

    @Test
    public void testFindOne() {

    }

    @Test
    public void testFinish() {

    }

    @Test
    public void testCancel() {

    }
}
