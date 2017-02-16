package com.company.physics;

/**
 * Created by Chris Cavazos on 2/15/2017.
 */
public class CircularMotion2D {
    /*
        Velocity Functions
    */
    public static double vel(double radialAcc, double radius){
        if (radialAcc*radius >= 0) {
            return Math.sqrt(radialAcc*radius);
        } else {
            System.out.println("-Nonreal ans error-");
            return 0;
        }
    }
    public static double vel2(double period, double radius){
        if (period != 0) {
            return  (2*Math.PI*radius) / period;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    /*
        Acceleration Functions
    */
    public static double radialAcc(double vel, double radius){
        if (radius != 0) {
            return  (vel*vel) / radius;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    /*
        Radius Functions
    */
    public static double radius(double vel, double radialAcc){
        if (radialAcc != 0) {
            return  (vel*vel) / radialAcc;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double radius2(double vel, double period){
            return  (vel* period) / (2*Math.PI);
    }
    /*
        Period Functions
    */
    public static double period(double vel, double radius){
        if (vel != 0) {
            return  (2*Math.PI*radius) / vel;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
}
