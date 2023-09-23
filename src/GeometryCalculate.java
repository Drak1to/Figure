import java.util.ArrayList;

import java.util.List;

public class GeometryCalculate {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Triangle t = new Triangle(10,9,11);
        Rectangle r = new Rectangle(8,6);
        System.out.println("Length of circle");
        c.calculatePerimeter();
        System.out.println("Area of circle");
        c.calculateArea();
        System.out.println("Perimeter of triangle");
        t.calculatePerimeter();
        System.out.println("Area of triangle");
        t.calculateArea();
        System.out.println("Perimeter of rectangle");
        r.calculatePerimeter();
        System.out.println("Area of rectangle");
        r.calculateArea();

        }

    }








