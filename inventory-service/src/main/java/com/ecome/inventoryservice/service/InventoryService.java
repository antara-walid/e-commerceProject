package com.ecome.inventoryservice.service;

import com.ecome.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {


     List<InventoryResponse>  areInStock(List<String> skuCodes);
}
