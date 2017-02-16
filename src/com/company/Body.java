package com.company;

import com.company.physics.Physics;

import java.util.ArrayList;

/**
 * Created by Dago on 2/15/2017.
 */
public class Body {
    public double getMass() {
        return mass;
    }


    public void setMass(double mass) {
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

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getSpecificHeat() {
        return specificHeat;
    }

    public void setSpecificHeat(double specificHeat) {
        this.specificHeat = specificHeat;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    private double mass;
    private Vector2 position;
    private ArrayList<Force> forces;
    private double velocity;
    private double acceleration;
    private double friction;
    private double temperature;
    private double specificHeat;
    private double heatCapacity;
    private double coeffOfFriction;
    private double centerOfmass;

    public Body() {

    }

    public Body(Body body) {
        copy(body);
    }

    public Body(double mass, Vector2 position, ArrayList<Force> forces, double
            velocity, double acceleration, double friction, double temperature, double specificHeat, double heatCapacity, double coeffOfFriction) {
        this.mass = mass;
        this.position = position;
        this.forces = forces;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.friction = friction;
        this.temperature = temperature;
        this.specificHeat = specificHeat;
        this.heatCapacity = heatCapacity;
        this.coeffOfFriction = coeffOfFriction;

    }

    public void copy(Body body) {
        this.mass = body.mass;
        this.position = body.position;
        this.forces = body.forces;
        this.velocity = body.velocity;
        this.acceleration = body.acceleration;
        this.friction = body.friction;
        this.temperature = body.temperature;
        this.specificHeat = body.specificHeat;
        this.heatCapacity = body.heatCapacity;
        this.coeffOfFriction = body.coeffOfFriction;

    }
    public double getGravForce(Body body){
        double gravity = (Physics.gravAcc*this.mass*body.mass)/(Math.pow(EMath.pathag(position,body.getPosition()),2));
        return gravity;

    }


}
