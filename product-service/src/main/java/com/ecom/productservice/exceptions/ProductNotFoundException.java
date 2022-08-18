package com.ecom.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException() {
        super("Product not found ");
    }
}
