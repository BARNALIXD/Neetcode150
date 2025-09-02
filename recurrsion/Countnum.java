package recurrsion;

public class Countnum {
    public static void main(String[] args) {
        System.out.println(count(5134));
    }

    public static int count(int n) {
        if(n==0) return 0;
        return 1 + count(n/10);
    }
}
