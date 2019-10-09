package com.company;

public class Circle {
    private final double radius;

    public Circle(double  radius) {
        this.radius = radius;
    }

    public double getArea(){return (3.14 * radius * radius);}
}
