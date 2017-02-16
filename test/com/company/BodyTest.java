package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Dago on 2/16/2017.
 */
class BodyTest {
    @Test
    void  getGravForce() {
        double mass1 = 5.974 * Math.pow(10, 24);
        double mass2 = 7.349 * Math.pow(10, 22);
        Vector2 vector2 = new Vector2(0, 0);
        Vector2 vector = new Vector2(1, 1);
        Body b1 = new Body(mass1, vector2);
        Body b2 = new Body(mass2, vector);
        double num = b1.getGravForce(b2);
        System.out.println(num);
    }

}