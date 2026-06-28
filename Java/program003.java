import java.util.Scanner;

class Program03
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        float i, j, k;

        System.out.println("Enter first number :");
        i = sobj.nextFloat();

        System.out.println("Enter second number :");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is : " + k);
    }
}
