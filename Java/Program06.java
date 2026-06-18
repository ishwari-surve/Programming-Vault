import java.util.Scanner;

public class AddTwoNumbers {

   
    static float AddTwoNumbers(float fNo1, float fNo2) {
        float fAns = 0.0f;
        fAns = fNo1 + fNo2;
        return fAns;
    }

    public static void main(String[] args) {
        float fValue1 = 0.0f;   // To store first input
        float fValue2 = 0.0f;   // To store second input
        float fResult = 0.0f;   // To store the result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        fValue1 = scanner.nextFloat();

        System.out.println("Enter second number :");
        fValue2 = scanner.nextFloat();

        fResult = AddTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is : " + fResult);

        scanner.close();
    }
}
