
/*
===============================================================================
Program Name    : Composition and Aggregation in Java
Program Number  : 010
Description     : This program demonstrates Composition and Aggregation
                  relationships using classes and objects.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

// Composition: Strong HAS-A Relationship

class Engine
{
    String engineType;

    Engine(String engineType)
    {
        this.engineType = engineType;
    }

    void Start()
    {
        System.out.println(engineType + " engine is starting.");
    }
}

class Car
{
    String carName;
    private Engine engine;

    Car(String carName, String engineType)
    {
        this.carName = carName;
        this.engine = new Engine(engineType);
    }

    void DisplayCar()
    {
        System.out.println("Car Name   : " + carName);
        System.out.println("Engine Type: " + engine.engineType);

        engine.Start();
    }
}

// Aggregation: Weak HAS-A Relationship

class Teacher
{
    String teacherName;

    Teacher(String teacherName)
    {
        this.teacherName = teacherName;
    }
}

class Department
{
    String departmentName;
    Teacher teacher;

    Department(String departmentName, Teacher teacher)
    {
        this.departmentName = departmentName;
        this.teacher = teacher;
    }

    void DisplayDepartment()
    {
        System.out.println("Department Name : " + departmentName);
        System.out.println("Teacher Name    : " + teacher.teacherName);
    }
}

class program010
{
    public static void main(String A[])
    {
        System.out.println("========== COMPOSITION ==========");

        Car cobj = new Car("Toyota Supra", "Petrol");
        cobj.DisplayCar();

        System.out.println("\n========== AGGREGATION ==========");

        Teacher tobj = new Teacher("Rahul");

        Department dobj = new Department("Computer Engineering", tobj);
        dobj.DisplayDepartment();
    }
}
