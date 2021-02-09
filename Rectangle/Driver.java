package Rectangle;

/*  Exercise 72123

    Create a class Rectangle with double attributes length and width.
    The default constructor should set these attributes to 1. Provide
    methods that calculate the rectangle's perimeter and area, as well
    as accessors and mutators for both data fields. The mutator methods
    for length and width should verify that the number being passed is
    larger than 0.0 and less than 20.0 -- if it doesn't fit those 
    criteria, the valye of the field should not be changed.

    Write a Driver class in the same file to test your Rectangle class.
    It should prompt the user to enter a length and width of a rectangle,
    and then print out the area and perimeter. (Use the mutators to set
    length and width of the rectangle, not the constructor.)
*/

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public double Perimeter() {
        double perimeter = 2 * (length + width);
        
        return perimeter;
    }

    public double Area() {
        double area = length * width;
        
        return area;
    }

    public void setLength(double length) {
        if (length > 0 && length <= 20.0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0 && length <= 20.0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter length of rectangle:");
        double length = input.nextDouble();
        System.out.print("Enter width of rectangle:");
        double width = input.nextDouble();

        rect.setLength(length);
        rect.setWidth(width);

        double area = rect.Area();
        double perimeter = rect.Perimeter();

        System.out.println("Area: " + area + ", Perimeter: " + perimeter);
    }
}