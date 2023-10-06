package com.ShipmentDetails.ShipmentDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShipmentDetails {
    @Id
    private Long shipperId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private double weight;
    private String comment;
    private String date;

    public ShipmentDetails(Long shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
                           int noOfTrucks, double weight, String comment, String date){
        super();
        this.shipperId =shipperId;
        this.loadingPoint=loadingPoint;
        this.unloadingPoint=unloadingPoint;
        this.productType=productType;
        this.truckType=truckType;
        this.noOfTrucks=noOfTrucks;
        this.weight=weight;
        this.comment=comment;
        this.date=date;
    }

    public ShipmentDetails(){
        super();
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ShipmentDetails{" +
                "shipperID=" + shipperId +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment=" + comment +
                ", date=" + date +
                '}';
    }
}
