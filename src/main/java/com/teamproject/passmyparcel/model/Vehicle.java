package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    Long VehicleId;

    @Column(nullable = false)

    Long TravellerId;

    String VehicleType;

    String VehicleNo;

    String AvailableSpace;

    public Vehicle(Long travellerId, String vehicleType, String vehicleNo, String availableSpace) {
        TravellerId = travellerId;
        VehicleType = vehicleType;
        VehicleNo = vehicleNo;
        AvailableSpace = availableSpace;
    }
    public Vehicle()
    {

    }

    public Long getVehicleId() {
        return VehicleId;
    }



    public Long getTravellerId() {
        return TravellerId;
    }

    public void setTravellerId(Long travellerId) {
        TravellerId = travellerId;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public String getAvailableSpace() {
        return AvailableSpace;
    }

    public void setAvailableSpace(String availableSpace) {
        AvailableSpace = availableSpace;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId=" + VehicleId +
                ", TravellerId=" + TravellerId +
                ", VehicleType='" + VehicleType + '\'' +
                ", VehicleNo='" + VehicleNo + '\'' +
                ", AvailableSpace='" + AvailableSpace + '\'' +
                '}';
    }
}
