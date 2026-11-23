
/*
===============================================================================
Program Name    : Bank Account Management using Encapsulation
Program Number  : 002
Description     : This program demonstrates encapsulation by maintaining
                  bank account details using private data members and
                  public methods to deposit, withdraw, and display balance.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

class BankAccount
{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void Deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
        else
        {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double GetBalance()
    {
        return balance;
    }

    public void Display()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

class program002
{
    public static void main(String A[])
    {
        BankAccount bobj = new BankAccount(101, "Rahul", 5000);

        bobj.Display();

        bobj.Deposit(2000);
        bobj.Withdraw(1500);

        System.out.println("Current Balance : " + bobj.GetBalance());
    }
}
