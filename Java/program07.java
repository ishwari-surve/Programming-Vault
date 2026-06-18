import java.util.Scanner;

public class AddTwoNumbers {

    
    static float AddTwoNumbers(
            float fNo1,    // First input
            float fNo2     // Second input
    ) {
        float fAns = 0.0f;          // Variable to store Result
        fAns = fNo1 + fNo2;         // Perform Addition
        return fAns;
    }

    public static void main(String[] args) {
        float fValue1 = 0.0f;   // To store first input
        float fValue2 = 0.0f;   // To store second input
        float fResult = 0.0f;   // To store the Result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        fValue1 = scanner.nextFloat();

        System.out.println("Enter the Second Number: ");
        fValue2 = scanner.nextFloat();

        fResult = AddTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is: " + fResult);

        scanner.close();
    }
}
