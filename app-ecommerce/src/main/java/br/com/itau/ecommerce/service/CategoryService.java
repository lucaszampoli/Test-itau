package br.com.itau.ecommerce.service;

import br.com.itau.ecommerce.model.ProductCategory;

import java.util.List;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
