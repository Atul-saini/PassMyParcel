package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class OrderDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    Long OrderId;

    Long TransactionId;

    Long UserId;

    Date DateOfOrder;

    String PickUpLocation;

    String DropLocation;

    String OrderStatus;

    String ExpectedStartTime;

    String ExpectedEndTime;

    public OrderDetails( Long transactionId, Long userId, Date dateOfOrder, String pickUpLocation, String dropLocation, String orderStatus, String expectedStartTime, String expectedEndTime) {

        TransactionId = transactionId;
        UserId = userId;
        DateOfOrder = dateOfOrder;
        PickUpLocation = pickUpLocation;
        DropLocation = dropLocation;
        OrderStatus = orderStatus;
        ExpectedStartTime = expectedStartTime;
        ExpectedEndTime = expectedEndTime;
    }

    public Long getOrderId() {
        return OrderId;
    }



    public Long getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(Long transactionId) {
        TransactionId = transactionId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Date getDateOfOrder() {
        return DateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        DateOfOrder = dateOfOrder;
    }

    public String getPickUpLocation() {
        return PickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        PickUpLocation = pickUpLocation;
    }

    public String getDropLocation() {
        return DropLocation;
    }

    public void setDropLocation(String dropLocation) {
        DropLocation = dropLocation;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getExpectedStartTime() {
        return ExpectedStartTime;
    }

    public void setExpectedStartTime(String expectedStartTime) {
        ExpectedStartTime = expectedStartTime;
    }

    public String getExpectedEndTime() {
        return ExpectedEndTime;
    }

    public void setExpectedEndTime(String expectedEndTime) {
        ExpectedEndTime = expectedEndTime;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "OrderId=" + OrderId +
                ", TransactionId=" + TransactionId +
                ", UserId=" + UserId +
                ", DateOfOrder=" + DateOfOrder +
                ", PickUpLocation='" + PickUpLocation + '\'' +
                ", DropLocation='" + DropLocation + '\'' +
                ", OrderStatus='" + OrderStatus + '\'' +
                ", ExpectedStartTime='" + ExpectedStartTime + '\'' +
                ", ExpectedEndTime='" + ExpectedEndTime + '\'' +
                '}';
    }
    public OrderDetails(){

    }
}
