package br.com.itau.ecommerce.service;


import br.com.itau.ecommerce.model.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Autor Lucas Zampoli 20/05/2020.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    // Todos os produtos vendidos
    Page<ProductInfo> findUpAll(Pageable pageable);
    // Todos os produtos
    Page<ProductInfo> findAll(Pageable pageable);
    // ATodos os produtos por categoria
    Page<ProductInfo> findAllInCategory(Integer categoryType, Pageable pageable);

    // Incrementa o estoque
    void increaseStock(String productId, int amount);

    //retira do estoque
    void decreaseStock(String productId, int amount);

    ProductInfo offSale(String productId);

    ProductInfo onSale(String productId);
    //atualiza
    ProductInfo update(ProductInfo productInfo);
    //salva
    ProductInfo save(ProductInfo productInfo);

    void delete(String productId);


}
