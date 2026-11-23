
/*
===============================================================================
Program Name    : Multilevel Inheritance Demonstration
Program Number  : 003
Description     : This program demonstrates multilevel inheritance in Java
                  using Vehicle, Car, and SportsCar classes.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class Vehicle
{
    String brand = "Toyota";

    void Start()
    {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle
{
    String model = "Supra";

    void Drive()
    {
        System.out.println("Car is driving.");
    }
}

class SportsCar extends Car
{
    int speed = 250;

    void Display()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Speed : " + speed + " km/h");
    }
}

class program003
{
    public static void main(String A[])
    {
        SportsCar sobj = new SportsCar();

        sobj.Start();
        sobj.Drive();
        sobj.Display();
    }
}
