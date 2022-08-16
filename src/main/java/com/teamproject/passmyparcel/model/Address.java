package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id",nullable = false,updatable = false)
    Long AddressId;

    String City;

    String State;

    Long Pincode;

    String Street;

    String Landark;

    public Long getAddressId() {
        return AddressId;
    }



    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Long getPincode() {
        return Pincode;
    }

    public void setPincode(Long pincode) {
        Pincode = pincode;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getLandark() {
        return Landark;
    }

    public void setLandark(String landark) {
        Landark = landark;
    }

    public Address( String city, String state, Long pincode, String street, String landark) {

        City = city;
        State = state;
        Pincode = pincode;
        Street = street;
        Landark = landark;
    }

    public Address() {

    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressId=" + AddressId +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Pincode=" + Pincode +
                ", Street='" + Street + '\'' +
                ", Landark='" + Landark + '\'' +
                '}';
    }
}
