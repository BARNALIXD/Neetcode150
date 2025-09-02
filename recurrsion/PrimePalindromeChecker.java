package recurrsion;

import java.util.Scanner;

public class PrimePalindromeChecker {

    public static boolean isPrime(int n, int divisor) {
        if (n <= 1)
            return false;
        if (divisor == 1)
            return true;
        if (n % divisor == 0)
            return false;
        return isPrime(n, divisor - 1);
    }

    public static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = isPrime(n, n / 2);
        boolean palindrome = isPalindrome(n);

        if (prime && palindrome) {
            System.out.println(n + " is both prime and palindrome.");
        } else {
            System.out.println(n + " is not both prime and palindrome.");
        }
    }
}
