package recurrsion;



public class isAuto {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(auto(n, n * n)); // Should print true for 25
    }

    public static boolean auto(int n, int sq) {
        if (n == 0)
            return true;
        if (n % 10 != sq % 10)
            return false;
        return auto(n / 10, sq / 10);
    }
}
