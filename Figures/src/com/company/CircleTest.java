package com.company;

import org.junit.Assert;
import  org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getAreaOneRadiusTest() {
        double radius = 1.0;
        Circle circle = new Circle(radius);
        Assert.assertEquals(Math.PI, circle.getArea(), 0.01);
    }

    @Test
    void getAreaZeroRadiusTest() {
        double radius = 0;
        Circle circle = new Circle(radius);
        Assert.assertEquals(0, circle.getArea(), 0.00001);
    }

}