import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt(); // Read first number

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt(); // Read second number

        int sum = num1 + num2; // Calculate sum

        // Display result
        System.out.println("The sum is: " + sum);

        input.close(); // Close the Scanner
    }
}