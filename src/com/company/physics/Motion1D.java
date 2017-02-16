package com.company.physics;


import com.company.EMath;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Motion1D {
    /*
        Position Functions
    */
    public static double pos(double posInit, double velInit, double cnstAcc, double t) {
        return posInit + velInit * t + .5f * (cnstAcc * t * t);
    }

    public static double posInit(double pos, double velInit, double cnstAcc, double t) {
        return pos - velInit * t - .5f * (cnstAcc * t * t);
    }

    public static double dPos(double velAvg, double dTime) {
        //vAvg-avg velocity
        return velAvg * dTime;//return change in position
    }

    /*
        Velocity Functions
     */
    //Straight line average velocity
    public static double velInit(double vel, double cnstAcc, double time) {
        return vel - (cnstAcc * time);
    }

    public static double velInit2(double velAvg, double cnstAcc, double time) {
        return velAvg - (.5f * cnstAcc * time);
    }

    public static double velInit(double pos, double posInit, double cnstAcc, double time) {
        if (time != 0) {
            return (pos - posInit - (cnstAcc * time * time)) / time;
        } else {
            return 0;
        }
    }

    public static double velAvg(double x1, double x2, double t1, double t2) {
        return velAvg(EMath.dx(x1, x2), EMath.dx(t1, t2));
    }

    public static double velAvg(double dx, double dTime) {
        DecimalFormat format =new DecimalFormat("#.##");
        if (dTime != 0) {
            return dx/dTime;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    public static double velAvg(double velInit, double cnstAcc, double time) {
        //Average velocity with constant acceleration
        return velInit + .5f * (cnstAcc * time);
    }

    public static double vel(double v0x, double cnstAcc, double t) {
        //Velocity at specific time with constant acceleration
        return v0x + (cnstAcc * t);
    }

    public static double dVel(double accAvg, double dTime) {
        return accAvg * dTime;
    }

    /*
        Acceleration Functions
    */
    //Straight line average
    public static double acc(double pos, double posInit, double velInit, double time) {
        if (time != 0) {
            return (pos - posInit - (velInit * time)) / (time * time);
        } else {
            return 0;
        }
    }

    public static double accAvg(double v1, double v2, double t1, double t2) {
        return accAvg(EMath.dx(v1, v2), EMath.dx(t1, t2));
    }

    public static double accAvg(double dVel, double dTime) {
        if (dTime != 0) {
            return dVel / dTime;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    /*
        Time Functions
    */
    public static double time(double vel, double velInit, double cnstAcc) {
        if (cnstAcc != 0) {
            return (vel - velInit) / cnstAcc;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    public static double time2(double velAvg, double velInit, double cnstAcc) {
        if (cnstAcc != 0) {
            return (2 * (velAvg - velInit)) / cnstAcc;
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    public static double[] time(double cnstAcc, double velInit, double pos, double posInit) {
        return  EMath.quadraticEq(-.5f * cnstAcc, -velInit, pos - posInit);
    }

    public static double dTime(double dpos, double velAvg) {
        if (velAvg != 0) {
            return dpos / velAvg;//change in time
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    public static double dTime2(double dVel, double velAvg) {
        if (velAvg != 0) {
            return dVel / velAvg;//change in time
        } else {
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
}