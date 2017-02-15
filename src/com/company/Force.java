package com.company;

/**
 * Created by Dago on 2/15/2017.
 */
public class Force extends Vector2 {
    public float magnitude;
    public float angle;

    public Force() {

    }

    public Force(float magnitude) {
        this.magnitude = magnitude;
    }

    public float getMagnitude() {
        return magnitude;

    }

    public float getAngle() {
        return angle;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }


}
