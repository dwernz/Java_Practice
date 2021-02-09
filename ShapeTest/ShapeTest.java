package ShapeTest;

import java.util.Scanner;

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

class Cube extends ThreeDimensionalShape {
    private double side;

    Cube(double side) {
        this.side = side;
    } // end constructor Cube

    public void setSide(double side) {
        this.side = side;
    } // end method setSide

    public double getSide() {
        return side;
    } // end method getSide

    public double getArea() {
        double area = 6 * side * side;

        return area;
    } // end method getArea

    public double getVolume() {
        double volume = side * side * side;

        return volume;
    } // end method getVolume
} // end class Cube

class Sphere extends ThreeDimensionalShape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    } // end constructor Sphere

    public void setRadius(double radius) {
        this.radius = radius;
    } // end method setRadius

    public double getRadius() {
        return radius;
    } // end method getRadius

    public double getArea() {
        double area = 4 * Math.PI * (radius * radius);

        return area;
    } // end method getArea

    public double getVolume() {
        double volume = 4 * Math.PI * (radius * radius * radius) / 3;

        return volume;
    } // end method getVolume
} // end class Sphere

class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    Tetrahedron(double side) {
        this.side = side;
    } // end constructor Tetrahedron

    public void setSide(double side) {
        this.side = side;
    } // end method setSide

    public double getSide() {
        return side;
    } // end method getSide

    public double getArea() {
        double area = Math.sqrt(3) * side * side;

        return area;
    } // end method getArea

    public double getVolume() {
        double volume = (side * side * side) / (Math.sqrt(2) * 6);

        return volume;
    } // end method getVolume
} // end class Tetrahedron

public class ShapeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice, choice2;

        System.out.println("Enter");
        System.out.println("1)Two dimensional shape");
        System.out.println("2)Three dimensioanl shape:Enter");
        choice = input.nextInt();

        if(choice == 1) {
            System.out.print("1)Circle\n2)Square\n3)Triangle:");
            choice2 = input.nextInt();

            if(choice2 == 1) {
                System.out.print("Enter radius of circle:");
                double radius = input.nextDouble();

                TwoDimensionalShape circle = new Circle(radius);

                System.out.printf("Area: %.2f", circle.getArea());
                System.out.printf("%nPerimeter: %.2f", circle.getPerimeter());
            }
            else if(choice2 == 2) {
                System.out.print("Enter side of square:");
                double side = input.nextDouble();

                TwoDimensionalShape square = new Square(side);

                System.out.printf("Area: %.2f", square.getArea());
                System.out.printf("%nPerimeter: %.2f", square.getPerimeter());
            }
            else if(choice2 == 3) {
                System.out.print("Enter side of triangle:");
                double side1 = input.nextDouble();
                System.out.print("Enter side of triangle:");
                double side2 = input.nextDouble();
                System.out.print("Enter side of triangle:");
                double side3 = input.nextDouble();

                TwoDimensionalShape triangle = new Triangle(side1, side2, side3);

                System.out.printf("Area: %.2f", triangle.getArea());
                System.out.printf("%nPerimeter: %.2f", triangle.getPerimeter());
            }
        }
        else if(choice == 2) {
            System.out.print("1)Sphere\n2)Cube\n3)Tetrahedron:");
            choice2 = input.nextInt();

            if(choice2 == 1) {
                System.out.print("Enter radius of sphere:");
                double radius = input.nextDouble();

                ThreeDimensionalShape sphere = new Sphere(radius);

                System.out.printf("Surface area: %.2f \nVolume: %.2f%n", sphere.getArea(), sphere.getVolume());
            }
            else if(choice2 == 2) {
                System.out.print("Enter side of cube:");
                double side = input.nextDouble();

                ThreeDimensionalShape cube = new Cube(side);

                System.out.printf("Surface area: %.2f \nVolume: %.2f%n", cube.getArea(), cube.getVolume());
            }
            else if(choice2 == 3) {
                System.out.print("Enter side of Tetrahedron:");
                double side = input.nextDouble();

                ThreeDimensionalShape tetrahedron = new Tetrahedron(side);

                System.out.printf("Surface area: %.2f \nVolume: %.2f%n", tetrahedron.getArea(), tetrahedron.getVolume());
            }
        }

        input.close();
    } // end method main
} // end class ShapeTest