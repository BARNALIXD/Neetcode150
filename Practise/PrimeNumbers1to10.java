public class PrimeNumbers1to10 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10:");
        for (int i = 2; i <= 100; i++) { // Start from 2, since 1 is not prime
            boolean isPrime = true;
            for (int j = 2; j < i; j++) { // Check divisibility from 2 to i-1
                if (i % j == 0) {
                    isPrime = false;
                    break; // Not a prime, exit inner loop
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
