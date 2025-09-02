package recurrsion;

public class isNeon {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(neon(n ,n*n, 0));
    }

    public static boolean neon(int n , int sq, int sum){
        if(sq==0) return sum==n;

        sum = sq%10 +sum;
        return neon(n,sq/10,sum);
    }
}
