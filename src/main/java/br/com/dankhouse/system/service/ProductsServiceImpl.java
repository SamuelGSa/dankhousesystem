package br.com.dankhouse.system.service;

import br.com.dankhouse.system.dto.ProductResponse;
import br.com.dankhouse.system.persistence.ProductsRepository;
import br.com.dankhouse.system.persistence.entity.Product;
import br.com.dankhouse.system.persistence.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}
