// for loop: used when we known "fixed iterations" to eg : count 0-9
//  Type 3 
import java.util.Scanner;

class NumberX
{
   public  boolean Checkdivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iValue % 5 == 0 ))
           {
           return true ;

           }
           else
           {
            return false ; 
           }
    }
}

class Program45
{
    
           public static void main(String A[])
          {
             Scanner sobj = new Scanner(System.in);

           int iValue = 0;

           System.out.println("Enter number :");
           iValue = sobj.nextInt();

           NumberX nobj = new NumberX();

           bRet= nobj.Checkdivisible(iValue); 

           if (bRet == true)
           {
            System.out.println("Number is dividble by 3 & 5");
           }
           else
           {
             ystem.out.println("Number is  not dividble by 3 & 5");
           }

    }
    
}


