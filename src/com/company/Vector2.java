package com.company;

/**
 * Created by Chris Cavazos on 2/14/2017.
 */
public class Vector2 {
    public double x;
    public double y;
    public double magnitude;
    public double angle;

    public Vector2() {

    }

    public Vector2(Vector2 v) {
        this.x = v.x;
        this.y = v.y;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(double x, double y, double magnitude) {
        this.x = x;
        this.y = y;
        this.magnitude = magnitude;
    }

    public Vector2 add(Vector2 vector) {
        vector.magnitude = this.magnitude + vector.magnitude;

        return vector;
    }
    public Vector2 add(Vector2 v1,Vector2 v2){


       v1.magnitude = v1.magnitude+v2.magnitude;
        return v1;
    }

    public Vector2 subtract(Vector2 vector){
        vector.magnitude = this.magnitude - vector.magnitude;

        return vector;
    }

    public double getMagnitude(){
        return magnitude;
    }
    public double getMagnitude(Vector2 v1,Vector2 v2){
        double mag;
        mag=(double) Math.sqrt((Math.pow(v2.x-v1.x,2))+(Math.pow(v2.y-v1.y,2)));
        return mag;
    }

    public double getAngle(){
        return angle;
    }
    public double getAngle(Vector2 v1,Vector2 v2){
        double angle;
        double x = (v2.y-v1.y)/(v2.x-v1.x);
     angle= (Math.atan(x)*57.296);
     return angle;
    }





    public double dx(Vector2 a) {
        return this.x - a.x;
    }

    public double dy(Vector2 a) {
        return this.y - a.y;
    }
}
