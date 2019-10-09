package com.company;

public class Square {
    private final double side;

    public Square(double side){
        this.side = side;
    }

    public double getArea(){return side * side;}
}
