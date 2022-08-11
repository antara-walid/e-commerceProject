package com.ecom.inventoryservice.controller;


import com.ecom.inventoryservice.dto.InventoryResponse;
import com.ecom.inventoryservice.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> areInStock(@RequestParam List<String> skuCodes) {
        return inventoryService.areInStock(skuCodes);
    }
}
