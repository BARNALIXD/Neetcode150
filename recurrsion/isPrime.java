package recurrsion;

public class isPrime {
    public static void main(String[] args) {
        range(1,100,0);
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) return true;
        if (n <= 1 || n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    public static void range(int st, int end, int count) {

        if (st > end) return;
        if (isPrime(st, st / 2)) {
            count++;
            if (count == 2) {
                System.out.println(st);}}
                range(st + 1, end, count);
    }
}