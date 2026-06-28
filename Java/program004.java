import java.util.Scanner;

class Program04
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        float i = 0.0f;
        float j = 0.0f;
        float k = 0.0f;

        System.out.println("Enter first number :");
        i = sobj.nextFloat();

        System.out.println("Enter second number :");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is : " + k);
    }
}
