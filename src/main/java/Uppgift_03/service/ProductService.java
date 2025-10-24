package Uppgift_03.service;

import Uppgift_03.exceptions.ProductNotFoundException;
import Uppgift_03.entity.Product;
import Uppgift_03.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {

        return productRepository.save(product);
    }

    public Product findByName(String name) {
        return productRepository.findByName (name)
                .orElseThrow(() -> new ProductNotFoundException("Product with name '" + name + "' not found"));
    }
}
