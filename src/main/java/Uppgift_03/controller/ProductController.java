package Uppgift_03.controller;

import Uppgift_03.entity.Product;
import Uppgift_03.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

   @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return ResponseEntity.ok().body(savedProduct);
   }

    @GetMapping("/search")
    public ResponseEntity<Product> getProductByName(@RequestParam String name) {
        Product product = productService.findByName(name);
        return ResponseEntity.ok(product);
    }
}

