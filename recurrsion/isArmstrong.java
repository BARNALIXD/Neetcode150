package recurrsion;

public class isArmstrong {
    public static void main(String[] args) {
        int n =153;
        System.out.println(isArmstrong(n, n, 0));
    }

    public static boolean isArmstrong(int n, int m, int sum){
        if(n==0) return m==sum;

        sum+= Math.pow(n%10,3);
        return isArmstrong(n/10, m, sum);
    }
}
