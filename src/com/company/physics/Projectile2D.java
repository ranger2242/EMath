package com.company.physics;

import com.company.EMath;

/**
 * Created by Chris Cavazos on 2/15/2017.
 */
public class Projectile2D {
    /*
        Position Functions
    */
    public static double posX(double xInit, double velXInit, double time){
        return xInit+velXInit*time;
    }
    public static double xInit(double x, double velXInit, double time){
        return x-velXInit*time;
    }
    public static double posY(double posYInit, double velYInit, double gravity, double time){
        return posYInit+(velYInit*time)-(.5f*gravity*time*time);
    }
    public static double yInit(double posY, double velYInit, double gravity, double time){
        return posY-(velYInit*time)+(.5f*gravity*time*time);
    }
    /*
        Velocity Functions
     */
    public static double vel(double velX,double velY){
        return Math.sqrt((velX*velX)+(velY*velY));
    }
    public static double velInit(double velXInit, double thetaDegInit){
        if (Math.cos(Math.toRadians(thetaDegInit)) != 0) {
            return  velXInit / Math.cos(Math.toRadians(thetaDegInit));
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double velXInit(double x, double xInit, double time){
        if (time != 0) {
            return (x-xInit) / time;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double velXInit(double velInit,double thetaDegInit){
        return velInit*Math.cos(Math.toDegrees(thetaDegInit));//so many changes
    }
    public static double velY(double velYInit, double gravity, double time){
        return velYInit-gravity*time;
    }
    public static double velYInit(double velY, double gravity, double time){
        return velY-gravity*time;
    }
    public static double velYInit(double posY, double posYInit, double gravity, double time){
        if (time != 0) {
            return (posY-posYInit+(.5f*gravity*time*time))/time;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    /*
        Time Functions
    */
    public static double time(double x, double xInit, double velXInit){
        if (velXInit != 0) {
            return (x-xInit) / velXInit;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double time2(double velY, double velYInit, double gravity){
        if (gravity != 0) {
            return (velY-velYInit) / -gravity;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double[] time(double posY, double posYInit, double velYInit, double gravity){
        return EMath.quadraticEq(-.5f*gravity,velYInit,(posYInit-posY));
    }
    /*
        Gravity Functions
    */
    public static double gravity(double velY, double velYInit, double time){
        if (time != 0) {
            return (velY-velYInit) / -time;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static double gravity(double posY, double posYInit, double velYInit, double time){
        if (time != 0) {
            return (posY-posYInit+(.5f*velYInit*time*time))/(time*time);
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    /*
        Angle Functions
    */
    public static double thetaInitDeg(double velXInit, double velInit){
        return Math.acos(Math.toRadians(velXInit/velInit));
    }
}
