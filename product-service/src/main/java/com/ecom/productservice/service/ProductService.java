package com.ecom.productservice.service;

import com.ecom.productservice.dto.ProductRequest;
import com.ecom.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse getProduct(String id);

    ProductResponse updateProduct(String id, ProductRequest productRequest);
}
