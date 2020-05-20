package br.com.itau.ecommerce.domain;

import br.com.itau.ecommerce.domain.CodeEnum;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "novo"),
    FINISHED(1, "finalizado"),
    CANCELED(2, "Cancelado")
    ;

    private  int code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
