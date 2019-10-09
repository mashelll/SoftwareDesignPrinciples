package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getAreaZeroLengthTest() {
        double length = 0;
        double width = 5;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(0, rectangle.getArea(), 0.00001);
    }

    @Test
    void getAreaZeroWidthTest() {
        double length = 4;
        double width = 0;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(0, rectangle.getArea(), 0.00001);
    }

    @Test
    void getZeroAreaTest() {
        double length = 0;
        double width = 0;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(0, rectangle.getArea(), 0.00001);
    }

    @Test
    void getNotZeroAreaTest() {
        double length = 6;
        double width = 7;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(42, rectangle.getArea(), 0.00001);
    }
}