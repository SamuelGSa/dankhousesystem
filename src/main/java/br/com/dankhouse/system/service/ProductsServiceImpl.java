package br.com.dankhouse.system.service;

import br.com.dankhouse.system.dto.ProductRequest;
import br.com.dankhouse.system.dto.ProductResponse;
import br.com.dankhouse.system.persistence.ProductsRepository;
import br.com.dankhouse.system.persistence.entity.Product;
import br.com.dankhouse.system.persistence.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductService{

    private final ProductsRepository productsRepository;

    private final ProductMapper productsMapper;

    @Override
    public List<ProductResponse> getAllProducts() {

        log.info("Buscando todos os produtos");

        List<Product> productListEntity = productsRepository.findAll();

        // Usando o UsuarioMapper para converter a lista
        var productList = productListEntity.stream()
                .map(productsMapper::mapModelToDTO)
                .collect(Collectors.toList());

        return productList;

    }

    @Override
    public List<ProductResponse> getProductByName(String name) {

        var produtosSolicitados = productsRepository.findByNameContainingIgnoreCase(name);
        if (produtosSolicitados == null || produtosSolicitados.isEmpty()) {
            return Collections.emptyList();
        }
        return produtosSolicitados.stream()
                .map(productsMapper::mapModelToDTO)
                .collect(Collectors.toList());
    }

    public ProductResponse saveProduct(ProductRequest productRequest) {
        Product product = productsMapper.mapDTOToModel(productRequest);

        productsRepository.save(product);
        var productResponse = productsMapper.mapModelToDTO(product);
        return productResponse;
    }

    @Override
    public ProductResponse getProductByProductCode(String id) {
        var produtoSolicitado = productsRepository.findByProductCode(id);
        if (produtoSolicitado == null) {
            return new ProductResponse();
        }
        var productResponse = productsMapper.mapModelToDTO(produtoSolicitado);

        return productResponse;
    }

}