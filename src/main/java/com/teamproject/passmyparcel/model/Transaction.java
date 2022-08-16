package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    Long TransactionId;

    @Column(nullable = false)
    Long TravellerId;

    @Column(nullable = false)
    Long VehicleId;

    String StartTime;

    String TravellerStatus;

    String StartLocation;

    String EndLocation;

    public Transaction(Long travellerId, Long vehicleId, String startTime, String travellerStatus, String startLocation, String endLocation) {
        TravellerId = travellerId;
        VehicleId = vehicleId;
        StartTime = startTime;
        TravellerStatus = travellerStatus;
        StartLocation = startLocation;
        EndLocation = endLocation;
    }
    public Transaction(){

    }

    public Long getTransactionId() {
        return TransactionId;
    }



    public Long getTravellerId() {
        return TravellerId;
    }

    public void setTravellerId(Long travellerId) {
        TravellerId = travellerId;
    }

    public Long getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        VehicleId = vehicleId;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getTravellerStatus() {
        return TravellerStatus;
    }

    public void setTravellerStatus(String travellerStatus) {
        TravellerStatus = travellerStatus;
    }

    public String getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation(String startLocation) {
        StartLocation = startLocation;
    }

    public String getEndLocation() {
        return EndLocation;
    }

    public void setEndLocation(String endLocation) {
        EndLocation = endLocation;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "TransactionId=" + TransactionId +
                ", TravellerId=" + TravellerId +
                ", VehicleId=" + VehicleId +
                ", StartTime='" + StartTime + '\'' +
                ", TravellerStatus='" + TravellerStatus + '\'' +
                ", StartLocation='" + StartLocation + '\'' +
                ", EndLocation='" + EndLocation + '\'' +
                '}';
    }
}
