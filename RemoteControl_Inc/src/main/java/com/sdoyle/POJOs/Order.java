/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdoyle.POJOs;

/**
 *
 * @author samdo
 */
public class Order {
    private int orderID;
    private String orderDate;
    private String custName;
    private String status;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

 
    public String getCustName() {
        return custName;
    }

  
    public void setCustName(String custName) {
        this.custName = custName;
    }

   
    public String getStatus() {
        return status;
    }

  
    public void setStatus(String status) {
        this.status = status;
    }
    
}