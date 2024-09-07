package com.test.classes;

import java.time.LocalDate;

public class Order {
    String orderNum;
    LocalDate orderDate;
    Integer orderAmount;

    public Order(String orderNum, LocalDate orderDate, Integer orderAmount) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public Order() {
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }
}
