package com.company;

import java.util.ArrayList;

/**
 * Created by Dago on 2/15/2017.
 */
public class Body {
    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public ArrayList<Force> getForces() {
        return forces;
    }

    public void setForces(ArrayList<Force> forces) {
        this.forces = forces;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getFriction() {
        return friction;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getSpecificHeat() {
        return specificHeat;
    }

    public void setSpecificHeat(float specificHeat) {
        this.specificHeat = specificHeat;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    private float mass;
    private Vector2 position;
    private ArrayList<Force> forces;
    private float velocity;
    private float acceleration;
    private float friction;
    private float temperature;
    private float specificHeat;
    private float heatCapacity;

    public Body(){

    }
    public Body(Body body){
        copy(body);
    }
    public Body(float mass,Vector2 position,ArrayList<Force> forces,float
            velocity,float acceleration,float friction,float temperature,float specificHeat,float heatCapacity) {
        this.mass=mass;
        this.position=position;
        this.forces=forces;
        this.velocity=velocity;
        this.acceleration=acceleration;
        this.friction=friction;
        this.temperature=temperature;
        this.specificHeat=specificHeat;
        this.heatCapacity=heatCapacity;

    }
    public void copy(Body body){
        this.mass=body.mass;
        this.position=body.position;
         this.forces=body.forces;
         this.velocity=body.velocity;
        this.acceleration=body.acceleration;
       this.friction=body.friction;
         this.temperature=body.temperature;
        this.specificHeat=body.specificHeat;
       this.heatCapacity=body.heatCapacity;

    }


}
