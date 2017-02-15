package com.company;

import java.util.ArrayList;

/**
 * Created by Dago on 2/15/2017.
 */
public class Force {
    public float magnitude; //magnitude is si form so magnitude is in Newtons
    public float angle;
    Vector2 vector;


    public Force() {

    }

    public Force(float magnitude) {
        this.magnitude = magnitude;
    }
    public Force(float magnitude, float angle){
        this.magnitude=magnitude;
        this.angle = angle;
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
    public static float summationForces(ArrayList<Force> forces){
        float sum=0;
        int x=0;
        while(!forces.isEmpty()){
            sum+=forces.get(x).magnitude;
        }
        return sum;

    }


}
