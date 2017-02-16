package com.company;

/**
 * Created by Dago on 2/15/2017.
 */
public class Force extends Vector2 {
    public double magnitude;
    public double angle;

    public Force() {

    }

    public Force(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;

    }

    public double getAngle() {
        return angle;
    }//change

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }


}
