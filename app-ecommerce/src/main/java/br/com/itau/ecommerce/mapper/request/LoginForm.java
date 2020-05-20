package br.com.itau.ecommerce.mapper.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
