// for loop: used when we know "fixed iterations" eg : count 0-9
// Type 3
import java.util.Scanner;

class NumberX
{
    public static boolean Checkdivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program16
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        bRet = NumberX.Checkdivisible(iValue);

        if(bRet == true)
        {
            System.out.println("Number is divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 & 5");
        }

        sobj.close();
    }
}
