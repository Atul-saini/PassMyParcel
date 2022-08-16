package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Traveller implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    Long TravellerId;

    @Column(nullable = false, updatable = false)
    Long Id;
    Long Aadharno;

    Long RatingId;
    public Long getTravellerId() {
        return TravellerId;
    }



    public Long getId() {
        return Id;
    }



    public Long getAadharno() {
        return Aadharno;
    }

    public void setAadharno(Long aadharno) {
        Aadharno = aadharno;
    }

    public Long getRatingId() {
        return RatingId;
    }

    public void setRatingId(Long ratingId) {
        RatingId = ratingId;
    }

    public Traveller(Long id, Long aadharno, Long ratingId) {
        Id = id;
        Aadharno = aadharno;
        RatingId = ratingId;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "TravellerId=" + TravellerId +
                ", Id=" + Id +
                ", Aadharno=" + Aadharno +
                ", RatingId=" + RatingId +
                '}';
    }

    public Traveller() {

    }
}