package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getAreaZeroSideTest() {
        double side = 0;
        Square square = new Square(side);
        Assert.assertEquals(0, square.getArea(), 0.00001);
    }

    @Test
    void getAreaNotZeroSideTest() {
        double side = 4;
        Square square = new Square(side);
        Assert.assertEquals(16, square.getArea(), 0.00001);
    }
}