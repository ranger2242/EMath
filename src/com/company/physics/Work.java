package com.company.physics;

import com.company.Force;

/**
 * Created by Chris Cavazos on 2/16/2017.
 */
public class Work {
    /*
        Work Functions
    */
    public static double work(Force force, double disp,double thetaDeg){
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
}
