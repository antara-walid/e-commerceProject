package com.ecom.productservice.entity;


import com.ecom.productservice.dto.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price ;


    public ProductResponse mapToProductResponse()
    {
        return ProductResponse.builder()
                .id(this.id)
                .name(this.name)
                .description(this.description)
                .price(this.price)
                .build();
    }
}
