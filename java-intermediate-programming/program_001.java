
/*
===============================================================================
Program Name    : Employee Management System
Program Number  : 001
Description     : This program demonstrates an Employee Management System
                  using classes and objects. It stores employee details
                  and displays employee information.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;

class Employee
{
    int employeeId;
    String employeeName;
    String department;
    double salary;

    Employee(int employeeId, String employeeName, String department, double salary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void Display()
    {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("--------------------------------");
    }
}

class program001
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int size = sobj.nextInt();

        Employee eobj[] = new Employee[size];

        for(int i = 0; i < size; i++)
        {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sobj.nextInt();

            sobj.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sobj.nextLine();

            System.out.print("Enter Department: ");
            String dept = sobj.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sobj.nextDouble();

            eobj[i] = new Employee(id, name, dept, salary);
        }

        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        for(int i = 0; i < size; i++)
        {
            eobj[i].Display();
        }

        sobj.close();
    }
}
