package com.mvm.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String index() {
        return "Thank you for choosing our service";
    }

    @GetMapping("/product")
    public Product product() {
        return new Product(1, "iPhone XS MAX", 1299, "Black");
    }
}
