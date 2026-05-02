package com.klef.fsad.exam.model;

import jakarta.persistence.*;

@Entity
public class SupplierOrder {
    @Id
    private int orderId;
    private String name;
    private String date;
    private String status;

    public int getOrderId(){return orderId;}
    public void setOrderId(int id){this.orderId=id;}
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public String getDate(){return date;}
    public void setDate(String d){this.date=d;}
    public String getStatus(){return status;}
    public void setStatus(String s){this.status=s;}
}