package com.ecome.inventoryservice.controller;


import com.ecome.inventoryservice.dto.InventoryResponse;
import com.ecome.inventoryservice.service.InventoryService;
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
