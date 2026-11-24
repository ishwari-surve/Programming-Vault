
/*
===============================================================================
Program Name    : Method Overloading and Method Overriding
Program Number  : 005
Description     : This program demonstrates method overloading and method
                  overriding using classes and inheritance.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class Calculator
{
    int Add(int a, int b)
    {
        return a + b;
    }

    int Add(int a, int b, int c)
    {
        return a + b + c;
    }

    double Add(double a, double b)
    {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator
{
    @Override
    int Add(int a, int b)
    {
        System.out.println("Overridden Add Method Called");
        return a + b + 10;
    }
}

class program005
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator();

        System.out.println("========== METHOD OVERLOADING ==========");

        System.out.println("Addition of two integers : " + cobj.Add(10, 20));

        System.out.println("Addition of three integers : " + cobj.Add(10, 20, 30));

        System.out.println("Addition of two decimal numbers : " + cobj.Add(10.5, 20.5));

        System.out.println("\n========== METHOD OVERRIDING ==========");

        AdvancedCalculator aobj = new AdvancedCalculator();

        System.out.println("Addition Result : " + aobj.Add(10, 20));
    }
}
