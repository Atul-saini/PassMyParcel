package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class User implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(nullable = false,updatable = false)
     Long userid;

     @Column(nullable = false,updatable = false)
     Long id;

     @Column(name = "first_name")
     String FirstName;
     @Column(name="last_name")
     String LastName;

     @Column(name = "mobile_number",length = 10)
     String MobileNo;

     Long AddressId;

     public User( String firstName, String lastName, String mobileNo, Long addressId) {

          FirstName = firstName;
          LastName = lastName;
          MobileNo = mobileNo;
          AddressId = addressId;
     }

     public User() {

     }

     public Long getUserid() {
          return userid;
     }



     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getFirstName() {
          return FirstName;
     }

     public void setFirstName(String firstName) {
          FirstName = firstName;
     }

     public String getLastName() {
          return LastName;
     }

     public void setLastName(String lastName) {
          LastName = lastName;
     }

     public String getMobileNo() {
          return MobileNo;
     }

     public void setMobileNo(String mobileNo) {
          MobileNo = mobileNo;
     }

     public Long getAddressId() {
          return AddressId;
     }

     public void setAddressId(Long addressId) {
          AddressId = addressId;
     }

     @Override
     public String toString() {
          return "User{" +
                  "userid=" + userid +
                  ", id=" + id +
                  ", FirstName='" + FirstName + '\'' +
                  ", LastName='" + LastName + '\'' +
                  ", MobileNo='" + MobileNo + '\'' +
                  ", AddressId=" + AddressId +
                  '}';
     }
}
