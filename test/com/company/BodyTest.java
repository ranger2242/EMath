package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Dago on 2/16/2017.
 */
class BodyTest {
    @Test
    void  getGravForce() {
        double mass1 = 50;
        double mass2 = 6999580;
        Vector2 vector2 = new Vector2(0, 0);
        Vector2 vector = new Vector2(0, 50);
        Body b1 = new Body(mass1, vector2);
        Body b2 = new Body(mass2, vector);
        double num = b1.getGravForce(b2);
        System.out.println(num);
    }

}