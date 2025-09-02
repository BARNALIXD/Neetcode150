package recurrsion;

public class isSpy {
    public static void main(String[] args) {
        System.out.println(isSpy(132,0,1));
    }
    public static boolean isSpy(int n , int sum, int prod){
        if(n==0) return sum==prod;

        int r = n %10;
        sum+= r;
        prod*= r;

        return isSpy(n/10,sum,prod);

    }
}
