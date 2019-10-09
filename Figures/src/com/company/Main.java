package com.company;

public class Main {

    public static void main(String[] args) {
        double length = 5.1;
        double width = 4.2;
        double sr, ss;
        double sc;

	    Rectangle rectangle = new Rectangle(length, width);
	    Square square = new Square(length);
	    Circle circle = new Circle(1.0);

	    sr = rectangle.getArea();
	    ss = square.getArea();
	    sc = circle.getArea();

	    System.out.println(sr);
        System.out.println(ss);
        System.out.println(sc);
    }
}
