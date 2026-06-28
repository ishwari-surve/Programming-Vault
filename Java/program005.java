import java.util.Scanner;

class Program05
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        float fValue1 = 0.0f;
        float fValue2 = 0.0f;
        float fResult = 0.0f;

        System.out.println("Enter first number :");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number :");
        fValue2 = sobj.nextFloat();

        fResult = fValue1 + fValue2;

        System.out.println("Addition is : " + fResult);
    }
}
