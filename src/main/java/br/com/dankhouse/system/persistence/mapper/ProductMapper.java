package br.com.dankhouse.system.persistence.mapper;

import br.com.dankhouse.system.dto.ProductRequest;
import br.com.dankhouse.system.dto.ProductResponse;
import br.com.dankhouse.system.persistence.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public Product mapDTOToModel(ProductRequest productRequest) {
        return modelMapper.map(productRequest, Product.class);
    }

    // Método para mapear de Produto para ProdutoResponse
    public ProductResponse mapModelToDTO(Product product) {
        return modelMapper.map(product, ProductResponse.class);
    }



}
