package com.ecom.orderservice.service;

import com.ecom.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
