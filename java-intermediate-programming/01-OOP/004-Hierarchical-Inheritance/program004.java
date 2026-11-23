
/*
===============================================================================
Program Name    : Hierarchical Inheritance Demonstration
Program Number  : 004
Description     : This program demonstrates hierarchical inheritance in Java
                  where multiple child classes inherit from a single
                  parent class.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class Employee
{
    int employeeId;
    String employeeName;

    Employee(int employeeId, String employeeName)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void DisplayDetails()
    {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class Developer extends Employee
{
    String programmingLanguage;

    Developer(int employeeId, String employeeName, String programmingLanguage)
    {
        super(employeeId, employeeName);
        this.programmingLanguage = programmingLanguage;
    }

    void DisplayDeveloper()
    {
        DisplayDetails();
        System.out.println("Role          : Developer");
        System.out.println("Language      : " + programmingLanguage);
    }
}

class Manager extends Employee
{
    int teamSize;

    Manager(int employeeId, String employeeName, int teamSize)
    {
        super(employeeId, employeeName);
        this.teamSize = teamSize;
    }

    void DisplayManager()
    {
        DisplayDetails();
        System.out.println("Role          : Manager");
        System.out.println("Team Size     : " + teamSize);
    }
}

class program004
{
    public static void main(String A[])
    {
        Developer dobj = new Developer(101, "Rahul", "Java");

        Manager mobj = new Manager(102, "Priya", 8);

        System.out.println("========== DEVELOPER DETAILS ==========");
        dobj.DisplayDeveloper();

        System.out.println("\n========== MANAGER DETAILS ==========");
        mobj.DisplayManager();
    }
}
