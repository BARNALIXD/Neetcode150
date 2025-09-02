package recurrsion;

public class Emric {
    public static void main(String[] args) {
        int n = 17;
        if (isPrime(n, n / 2) && n != reverse(n, 0) && isPrime(reverse(n, 0), reverse(n, 0) / 2))
            System.out.println(n + " is an emric number.");
        else
            System.out.println(n + " is not an emric number.");
    }

    static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i == 1) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    static int reverse(int n, int rev) {
        return (n == 0) ? rev : reverse(n / 10, rev * 10 + n % 10);
    }
}
