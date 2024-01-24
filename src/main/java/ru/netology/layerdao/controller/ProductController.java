package ru.netology.layerdao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.layerdao.model.ProductScript;
import ru.netology.layerdao.repository.ProductScriptRepository;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {
    private final ProductScriptRepository productScriptRepository;

    public ProductController(ProductScriptRepository productScriptRepository) {
        this.productScriptRepository = productScriptRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<ProductScript> getProductsByName(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return productScriptRepository.findAll();
        } else {
            return Collections.singletonList(productScriptRepository.findByName(name));
        }
    }
}
