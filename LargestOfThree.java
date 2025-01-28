import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number using nested if statements
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        } // Intentional error: Missing closing brace for the outer if
        else {
            if (num2 > num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }

        scanner.close();
    }
}
