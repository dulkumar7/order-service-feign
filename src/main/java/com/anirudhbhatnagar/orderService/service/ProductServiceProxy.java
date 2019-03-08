package com.anirudhbhatnagar.orderService.service;

import com.anirudhbhatnagar.orderService.dto.product.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8001/api/products")
public interface ProductServiceProxy {

    @GetMapping("/{id}")
    Product getProduct(@PathVariable("id") Long id);
}
