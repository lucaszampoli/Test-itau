package br.com.itau.ecommerce.handler;


import br.com.itau.ecommerce.domain.ResultEnum;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
