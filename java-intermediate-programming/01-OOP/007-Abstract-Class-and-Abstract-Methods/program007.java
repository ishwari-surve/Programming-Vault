
/*
===============================================================================
Program Name    : Abstract Class and Abstract Methods
Program Number  : 007
Description     : This program demonstrates abstraction using an abstract
                  class and abstract methods in Java.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

abstract class Shape
{
    abstract double CalculateArea();

    abstract double CalculatePerimeter();

    void Display()
    {
        System.out.println("Calculating Shape Properties...");
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    double CalculateArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    double CalculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double CalculateArea()
    {
        return length * breadth;
    }

    @Override
    double CalculatePerimeter()
    {
        return 2 * (length + breadth);
    }
}

class program007
{
    public static void main(String A[])
    {
        Shape sobj;

        sobj = new Circle(5);

        System.out.println("========== CIRCLE ==========");
        sobj.Display();
        System.out.println("Area      : " + sobj.CalculateArea());
        System.out.println("Perimeter : " + sobj.CalculatePerimeter());

        sobj = new Rectangle(10, 5);

        System.out.println("\n========== RECTANGLE ==========");
        sobj.Display();
        System.out.println("Area      : " + sobj.CalculateArea());
        System.out.println("Perimeter : " + sobj.CalculatePerimeter());
    }
}
