package com.notepoint.dgsetdemo.home.history.historyOverview;

public class HistoryModel {

    private String productServiceName;
    private String status;
    private String orderRequestDate;
    private String deliveryDate;
    private String vendorDetail;
    private int imageUrl;

    public HistoryModel(String productServiceName, String status, String orderRequestDate, String deliveryDate, String vendorDetail, int imageUrl) {
        this.productServiceName = productServiceName;
        this.status = status;
        this.orderRequestDate = orderRequestDate;
        this.deliveryDate = deliveryDate;
        this.vendorDetail = vendorDetail;
        this.imageUrl = imageUrl;
    }

    public String getProductServiceName() {
        return productServiceName;
    }

    public void setProductServiceName(String productServiceName) {
        this.productServiceName = productServiceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderRequestDate() {
        return orderRequestDate;
    }

    public void setOrderRequestDate(String orderRequestDate) {
        this.orderRequestDate = orderRequestDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getVendorDetail() {
        return vendorDetail;
    }

    public void setVendorDetail(String vendorDetail) {
        this.vendorDetail = vendorDetail;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

}
