package com.company.physics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Dago on 2/15/2017.
 */
class Motion1DTest {
    @BeforeEach
    void setUp() {

    }

    @Test
    void velAvg() {
        float f= Motion1D.velAvg(5151000,1166000);
        assertEquals(f,4.4f);
    }

}