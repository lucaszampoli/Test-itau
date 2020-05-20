package br.com.itau.ecommerce.domain;

import lombok.Getter;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "Disponivel"),
    DOWN(1, "indisponivel")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getStatus(Integer code) {

        for(ProductStatusEnum statusEnum : ProductStatusEnum.values()) {
            if(statusEnum.getCode() == code) return statusEnum.getMessage();
        }
        return "";
    }

    public Integer getCode() {
        return code;
    }
}
