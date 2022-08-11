package com.ecom.inventoryservice;

import com.ecom.inventoryservice.repository.InventoryRepository;
import com.ecom.inventoryservice.entity.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository)
	{
		return args -> {
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("product1");
			inventory1.setQuantity(15);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("product2");
			inventory2.setQuantity(0);

			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
