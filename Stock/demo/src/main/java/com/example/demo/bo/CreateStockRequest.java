package com.example.demo.bo;

//http://localhost:8080/api/addItems
//{"quantity":234234,
//"item":"Item name"}
public class CreateStockRequest {

    private Long quantity;

    private String item;

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}