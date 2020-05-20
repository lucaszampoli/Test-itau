package br.com.itau.ecommerce.domain;

import lombok.Getter;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */

@Getter
public enum ResultEnum  {

    PARAM_ERROR(1, "Parameter Error!"),
    PRODUCT_NOT_EXIST(10, "Produto não existe!"),
    PRODUCT_NOT_ENOUGH(11, "Não há produtos suficientes em estoque!"),
    PRODUCT_STATUS_ERROR(12, "Status esta errado!"),
    PRODUCT_OFF_SALE(13,"Produto em promoção!"),
    PRODUCT_NOT_IN_CART(14,"O produto não está no carrinho!"),
    CART_CHECKOUT_SUCCESS(20, "Confirmado com sucesso! "),

    CATEGORY_NOT_FOUND(30, "Categoria não existe!"),

    ORDER_NOT_FOUND(60, "Pedido não existe!"),
    ORDER_STATUS_ERROR(61, "Status está incorreto"),


    VALID_ERROR(50, "Wrong information"),
    USER_NOT_FOUNT(40,"Usuário não encontrado!")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
