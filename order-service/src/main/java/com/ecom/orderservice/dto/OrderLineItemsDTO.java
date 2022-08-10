package com.ecom.orderservice.dto;

import com.ecom.orderservice.entity.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLineItemsDTO {
    private Long id ;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;


    public OrderLineItems mapToOrderLineItems()
    {
        return OrderLineItems.builder()
                .skuCode(this.skuCode)
                .price(this.price)
                .quantity(this.quantity)
                .build();
    }
}
