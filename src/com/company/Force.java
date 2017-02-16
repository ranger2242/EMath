package com.company;

import com.company.physics.Physics;

/**
 * Created by Dago on 2/15/2017.
 */
public class Force extends Vector2 {
    public double magnitude;
    public double angle;
    public double fy;
    public double fx;
    public Force() {

    }

    public Force(double magnitude) {
        this.magnitude = magnitude;
    }
    public Force(double magnitude,double angle){
        this.angle=angle;
        this.magnitude=magnitude;
        fy=magnitude*Math.sin(angle);
        fx=magnitude*Math.cos(angle);
    }

    public double getMagnitude() {
        return magnitude;

    }
    public double getWeight(Body body){
        double force= body.getMass()* Physics.gravAcc;
        return force;
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
