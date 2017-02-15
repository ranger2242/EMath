package com.company;

/**
 * Created by Chris Cavazos on 2/14/2017.
 */
public class Physics {
    /*
        Position Functions
    */
    public static float posx(float x0, float v0x, float ax, float t){
        return x0+v0x*t+.5f*(ax*t*t);
    }
    public static float dPos(float velAvg, float dTime){
        //vAvg-avg velocity
        return velAvg*dTime;//return change in position
    }
    /*
        Velocity Functions
     */
    //Straight line average velocity
    public static float velInit(float vel, float cnstAcc,float time ){
        return vel-(cnstAcc*time);
    }
    public static float velInit2(float velAvg, float cnstAcc,float time){
        return velAvg-(.5f*cnstAcc*time);
    }
    public static float velAvg(float x1, float x2, float t1, float t2){
        return velAvg(EMath.dx(x1,x2),EMath.dx(t1,t2));
    }
    public static float velAvg(float dPos, float dTime){
        if(dTime !=0){
            return dPos/dTime;
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static float velAvg(float velInit, float cnstAcc, float time){
        //Average velocity with constant acceleration
        return velInit+.5f*(cnstAcc*time);
    }
    public static float vel(float v0x, float cnstAcc,float t){
        //Velocity at specific time with constant acceleration
        return v0x+(cnstAcc*t);
    }
    public static float dVel(float accAvg, float dTime){
        return accAvg*dTime;
    }
    /*
        Acceleration Functions
    */
    //Straight line average acceleration
    public static float accAvg(float v1, float v2, float t1, float t2){
        return accAvg(EMath.dx(v1,v2),EMath.dx(t1,t2));
    }
    public static float accAvg(float dVel, float dTime){
        if(dTime !=0){
            return dVel/dTime;
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }

    /*
        Time Functions
    */
    public static float time(float vel, float velInit, float cnstAcc){
        if(cnstAcc !=0){
            return (vel-velInit)/cnstAcc;
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static float time2(float velAvg, float velInit, float cnstAcc){
        if(cnstAcc !=0){
            return (2*(velAvg-velInit))/cnstAcc;
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static float dTime(float dpos, float velAvg){
        if(velAvg !=0){
            return dpos/velAvg;//change in time
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
    public static float dTime2(float dVel, float velAvg){
        if(velAvg !=0){
            return dVel/velAvg;//change in time
        }else{
            System.out.println("-Divide by 0 error-");
            return 0;
        }
    }
}
