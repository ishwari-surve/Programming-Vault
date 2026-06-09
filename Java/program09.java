// for loop: used when we known "fixed iterations" to eg : count 0-9
// business logic not in main function Type 3 
import java.util.Scanner;

class Program42
{
    public static void Checkdivisible(String A[])
    {
        
           boolean Checkdivisible(int iNo)
           {
             if((iValue % 3 == 0) && (iValue % 5 == 0 ))
           {
            System.out.println("Number is dividble by 3 & 5");

           }
           else
           {
            System.out.println("Number is not dividible by 3 & 5");
           }
           }
           Scanner sobj = new Scanner(System.in);

           int iValue = 0;

           System.out.println("Enter number :");
           iNo = sobj.nextInt();

           Checkdivisible(iValue); 
    }
    
}

