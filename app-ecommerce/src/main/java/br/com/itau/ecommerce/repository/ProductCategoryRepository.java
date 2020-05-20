package br.com.itau.ecommerce.repository;

import br.com.itau.ecommerce.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    //  categoria
    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
    // busca todas as categorias
    List<ProductCategory> findAllByOrderByCategoryType();
    // busca uma categoria
    ProductCategory findByCategoryType(Integer categoryType);
}
