package br.com.dankhouse.system.controller;


import br.com.dankhouse.system.dto.ProductResponse;
import br.com.dankhouse.system.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("sistema/produto")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        var productsList = productService.getAllProducts();
        return new ResponseEntity<>(productsList, HttpStatus.OK);
    }
}
