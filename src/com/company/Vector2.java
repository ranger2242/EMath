package com.company;

/**
 * Created by Chris Cavazos on 2/14/2017.
 */
public class Vector2 {
    public float x;
    public float y;
    public Vector2(){

    }
    public Vector2(Vector2 v){
        this.x=v.x;
        this.y=v.y;
    }
    public Vector2(float x,float y){
        this.x=x;
        this.y=y;
    }
}
