package com.notepoint.dgsetdemo.home.products;

public class ProductModel {
    private String productName;
    private int productImageId;
    private double productPrice;

    public ProductModel(String productName, int productImageId, double productPrice) {
        this.productName = productName;
        this.productImageId = productImageId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(int productImageId) {
        this.productImageId = productImageId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
