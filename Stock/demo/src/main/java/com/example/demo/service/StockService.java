package com.example.demo.service;

import com.example.demo.bo.AccountResponse;
import com.example.demo.bo.CreateStockRequest;
import com.example.demo.bo.UpdateStockResponse;
import com.example.demo.entity.StockEntity;

import java.util.List;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
    AccountResponse getAll();
}