// for loop: used when we known "fixed iterations" to eg : count 0-9
// business logic in main function Type 
import java.util.Scanner;

class Program39
{
    public static void main(String A[])
    {
        
           Scanner sobj = new Scanner(System.in);

           int iValue = 0;

           System.out.println("Enter number :");
           iValue = sobj.nextInt();

           if((iValue % 3 == 0) && (iValue % 5 == 0 ))
           {
            System.out.println("Number is dividble by 3 & 5");

           }
           else
           {
            System.out.println("Number is not dividible by 3 & 5");
           }

    }
    
}

