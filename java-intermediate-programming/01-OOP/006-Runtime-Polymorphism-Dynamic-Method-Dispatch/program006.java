
/*
===============================================================================
Program Name    : Runtime Polymorphism using Dynamic Method Dispatch
Program Number  : 006
Description     : This program demonstrates runtime polymorphism using
                  method overriding and dynamic method dispatch.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class Animal
{
    void Sound()
    {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal
{
    @Override
    void Sound()
    {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal
{
    @Override
    void Sound()
    {
        System.out.println("Cat meows.");
    }
}

class Cow extends Animal
{
    @Override
    void Sound()
    {
        System.out.println("Cow moos.");
    }
}

class program006
{
    public static void main(String A[])
    {
        Animal aobj;

        System.out.println("========== RUNTIME POLYMORPHISM ==========");

        aobj = new Dog();
        aobj.Sound();

        aobj = new Cat();
        aobj.Sound();

        aobj = new Cow();
        aobj.Sound();
    }
}
