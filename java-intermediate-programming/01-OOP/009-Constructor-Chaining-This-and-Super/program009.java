
/*
===============================================================================
Program Name    : Constructor Chaining using this() and super()
Program Number  : 009
Description     : This program demonstrates constructor chaining using
                  this() and super() keywords in Java.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;

        System.out.println("Person Constructor Called");
    }

    void DisplayPerson()
    {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person
{
    int rollNumber;
    String department;

    Student()
    {
        this("Ishwari", 22, 101, "Electronics and Computer Engineering");

        System.out.println("Default Student Constructor Called");
    }

    Student(String name, int age, int rollNumber, String department)
    {
        super(name, age);

        this.rollNumber = rollNumber;
        this.department = department;

        System.out.println("Parameterized Student Constructor Called");
    }

    void DisplayStudent()
    {
        DisplayPerson();

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Department  : " + department);
    }
}

class program009
{
    public static void main(String A[])
    {
        Student sobj = new Student();

        System.out.println("\n========== STUDENT DETAILS ==========");

        sobj.DisplayStudent();
    }
}
