package com.rsemihkoca.productservicemain.service;

import com.rsemihkoca.productservicemain.model.Product;
import com.rsemihkoca.productservicemain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(String product) {
        return productRepository.getById(product);
    }

    public Product deleteProduct(Product product) {
        return productRepository.delete(product);
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
