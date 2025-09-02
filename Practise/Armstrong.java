import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int n = 0, result = 0, remainder;

        // Count the number of digits
        for (int temp = number; temp != 0; temp /= 10) {
            n++;
        }

        // Calculate the sum of digits raised to the power n
        for (int temp = number; temp != 0; temp /= 10) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }

        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }
}
