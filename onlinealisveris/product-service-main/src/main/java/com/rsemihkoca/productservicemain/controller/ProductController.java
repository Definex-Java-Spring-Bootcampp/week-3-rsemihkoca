package com.rsemihkoca.productservicemain.controller;


import com.rsemihkoca.productservicemain.model.Product;
import com.rsemihkoca.productservicemain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/onlinealisveris/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

}
