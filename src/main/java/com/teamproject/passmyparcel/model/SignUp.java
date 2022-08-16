package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class SignUp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    Long Id;

    @Column( nullable = false ,updatable = false)
    String email;

    @Column(nullable = false)
    String password;

    public SignUp(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return Id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public SignUp() {

    }
}
