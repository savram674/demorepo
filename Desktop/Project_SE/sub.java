import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt(); // Read first number

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt(); // Read second number

        int difference = num1 - num2; // Calculate difference

        // Display result
        System.out.println("The difference is: " + difference);

        input.close(); // Close the Scanner
    }
}