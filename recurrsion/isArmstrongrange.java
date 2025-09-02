package recurrsion;

public class isArmstrongrange {
    public static void main(String[] args) {
        int n =153;
        System.out.println(isArmstrong(n, n, 0));
        range(0,100);
    }

    public static boolean isArmstrong(int n, int m, int sum){
        if(n==0) return m==sum;

        sum+= Math.pow(n%10,3);
        return isArmstrong(n/10, m, sum);
    }
    public static void range(int st, int end){
        if(st>end) return;
        if(isArmstrong(st,st/2,0)){
            System.out.println(st);
            range(st + 1, end);
        }
    }
}
