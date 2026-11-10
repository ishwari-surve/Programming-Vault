class Vehicle
{ 
    String strBrand = "Toyota";
}

class Car extends Vehicle
{
    String strBrand = "BMW";

    void Display()
    {
        System.out.println("Child Brand  : " + strBrand);
        System.out.println("Parent Brand : " + super.strBrand);
    }
}

class program502
{
    public static void main(String A[])
    {
        Car cobj = new Car();

        cobj.Display();
    }
}
