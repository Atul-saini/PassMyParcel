package com.teamproject.passmyparcel.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Rating implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="rating_id", nullable = false,updatable = false)
    Long RatingId;

    Long OverallRating;

    @Column(name = "one_star_count")
    Long OneStar;
    @Column(name = "two_star_count")
    Long TwoStar;
    @Column(name = "three_star_count")
    Long ThreeStar;
    @Column(name = "four_star_count")
    Long FourStar;
    @Column(name = "five_star_count")
    Long FiveStar;

    public Rating(Long overallRating, Long oneStar, Long twoStar, Long threeStar, Long fourStar, Long fiveStar) {
        OverallRating = overallRating;
        OneStar = oneStar;
        TwoStar = twoStar;
        ThreeStar = threeStar;
        FourStar = fourStar;
        FiveStar = fiveStar;
    }
    public Rating()
    {

    }

    public Long getRatingId() {
        return RatingId;
    }



    public Long getOverallRating() {
        return OverallRating;
    }

    public void setOverallRating(Long overallRating) {
        OverallRating = overallRating;
    }

    public Long getOneStar() {
        return OneStar;
    }

    public void setOneStar(Long oneStar) {
        OneStar = oneStar;
    }

    public Long getTwoStar() {
        return TwoStar;
    }

    public void setTwoStar(Long twoStar) {
        TwoStar = twoStar;
    }

    public Long getThreeStar() {
        return ThreeStar;
    }

    public void setThreeStar(Long threeStar) {
        ThreeStar = threeStar;
    }

    public Long getFourStar() {
        return FourStar;
    }

    public void setFourStar(Long fourStar) {
        FourStar = fourStar;
    }

    public Long getFiveStar() {
        return FiveStar;
    }

    public void setFiveStar(Long fiveStar) {
        FiveStar = fiveStar;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "RatingId=" + RatingId +
                ", OverallRating=" + OverallRating +
                ", OneStar=" + OneStar +
                ", TwoStar=" + TwoStar +
                ", ThreeStar=" + ThreeStar +
                ", FourStar=" + FourStar +
                ", FiveStar=" + FiveStar +
                '}';
    }
}
