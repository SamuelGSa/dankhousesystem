package br.com.dankhouse.system.service;

import br.com.dankhouse.system.dto.ProductRequest;
import br.com.dankhouse.system.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProducts();

    List<ProductResponse> getProductByName(String name);

    ProductResponse saveProduct(ProductRequest productRequest);

}
