package com.example.demo.bo;

import com.example.demo.entity.StockEntity;

import java.util.List;

public class AccountResponse {
    List<StockEntity> stockList;

    public AccountResponse(List<StockEntity> stockList) {
        this.stockList = stockList;
    }

    public List<StockEntity> getStockList() {
        return stockList;
    }

    public void setStockList(List<StockEntity> stockList) {
        this.stockList = stockList;
    }
}
