import java.util.Scanner;
import java.math.*;

abstract class Shape {
} // end class Shape

abstract class TwoDimensionalShape extends Shape {
    abstract double getArea();
    abstract double getPerimeter();
} // end class TwoDimensionalShape

abstract class ThreeDimensionalShape extends Shape {
    abstract double getArea();
    abstract double getVolume();
} // end class ThreeDimensionalShape

class Circle extends TwoDimensionalShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    } // end constructor Circle

    public void setRadius(double radius) {
        this.radius = radius;
    } // end method setRadius

    public double getRadius() {
        return radius;
    } // end method getRadius

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);

        return area;
    } // end method getArea

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;

        return perimeter;
    } // end method getPerimeter
} // end class Circle

class Square extends TwoDimensionalShape {
    private double side;

    Square(double side) {
        this.side = side;
    } // end constructor Square

    public void setSide(double side) {
        this.side = side;
    } // end method setSide

    public double getSide() {
        return side;
    } // end method getSide;

    public double getArea() {
        double area = side * side;

        return area;
    } // end method getArea

    public double getPerimeter() {
        double perimeter = 4 * side;

        return perimeter;
    } // end method getPerimeter
} // end class Square

class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    } // end constructor Triangle

    public void setSide1(double side1) {
        this.side1 = side1;
    } // end method setSide1

    public void setSide2(double side2) {
        this.side2 = side2;
    } // end method setSide2

    public void setSide3(double side3) {
        this.side3 = side3;
    } // end method setSide3

    public double getSide1() {
        return side1;
    } // end method getSide1

    public double getSide2() {
        return side2;
    } // end method getSide2

    public double getSide3() {
        return side3;
    } // end method getSide3

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    } // end method getArea

    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;

        return perimeter;
    } // end method getPerimeter
} // end class Triangle

public class ShapeTest {
    
} // end class ShapeTest