import java.util.Scanner;

class Program02
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int i, j, k;

        System.out.println("Enter first number :");
        i = sobj.nextInt();

        System.out.println("Enter second number :");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : " + k);
    }
}
