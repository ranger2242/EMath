package com.company.physics;

import com.company.Body;
import com.company.Force;

/**
 * Created by Chris Cavazos on 2/16/2017.
 */
public class Dynamics {
    /*
        Work Functions
    */
    public static double work(Force force, double disp, double thetaDeg){
        return force.getMagnitude()*Math.cos(Math.toDegrees(thetaDeg))*disp;
    }
    public static double disp(Force force, double work, double thetaDeg){
        if (force.getMagnitude()*Math.cos(Math.toDegrees(thetaDeg)) != 0) {
            return work/force.getMagnitude()*Math.cos(Math.toDegrees(thetaDeg));
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static Force force(double work, double disp){
        if (disp != 0) {
            return new Force(work/disp);
        } else {
            return new Force(0);
        }
    }

    /*
        Energy Functions
    */
    public static double kinetic(Body body){
        return kinetic(body.getMass(),body.getVelocity());
    }
    public static double kinetic(double mass, double vel){
        return .5*mass*vel*vel;
    }
    public static double vel(double energyK, double mass){
        if(mass==0){
            System.out.println("-Divide by 0 error-");
            return 0;
        }else if(((2*energyK)/mass<0)){
            System.out.println("-Nonreal ans error-");
            return 0;
        }
        else{
            return Math.sqrt((2*energyK)/mass);
        }
    }
    public static double mass(double vel, double energyK){
        if (vel!= 0) {
            return (2*energyK)/(vel*vel);
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    /*
        Power Functions
    */
}
