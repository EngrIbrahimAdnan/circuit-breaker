package com.example.demo.controller;

import com.example.demo.bo.CreateStockRequest;
import com.example.demo.bo.UpdateStockResponse;
import com.example.demo.bo.AccountResponse;
import com.example.demo.service.StockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }

    @GetMapping("/getStock")
    public AccountResponse getStock() {
        return stockService.getAll();
    }
}