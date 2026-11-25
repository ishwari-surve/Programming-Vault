
/*
===============================================================================
Program Name    : Interface Implementation and Multiple Inheritance
Program Number  : 008
Description     : This program demonstrates multiple inheritance using
                  interfaces in Java. A single class implements multiple
                  interfaces and provides implementations for their methods.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

interface Printable
{
    void Print();
}

interface Scannable
{
    void Scan();
}

interface Faxable
{
    void Fax();
}

class MultiFunctionPrinter implements Printable, Scannable, Faxable
{
    @Override
    public void Print()
    {
        System.out.println("Printing document...");
    }

    @Override
    public void Scan()
    {
        System.out.println("Scanning document...");
    }

    @Override
    public void Fax()
    {
        System.out.println("Sending fax...");
    }

    void Display()
    {
        System.out.println("Multi-Function Printer Operations");
    }
}

class program008
{
    public static void main(String A[])
    {
        MultiFunctionPrinter mobj = new MultiFunctionPrinter();

        mobj.Display();
        mobj.Print();
        mobj.Scan();
        mobj.Fax();
    }
}
