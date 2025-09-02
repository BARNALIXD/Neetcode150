package recurrsion;

public class pri_pal {
    public static void main(String[] args) {
        if(prime(11,5) && pal(11,11,0)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static boolean prime(int n, int i) {
        if (i == 1) return true;
        if (n <= 1 || n % i == 0) return false;
        return prime(n, i - 1);
    }

    public static boolean pal(int n , int m , int rev){
        if(n==0) return m==rev;
        rev=n%10+n*10;
        return pal(n/10,m,rev);
    }
}
