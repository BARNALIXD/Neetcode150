//package recurrsion;
//
//public class isPerfect{
//    public static void main(String[] args) {
//
//       int n = 6;
//       System.out.println( isPerfect(n, n/2, 0));
//        System.out.println(range(1,10));
//        range(1, 10);
//
//    }
//
//    public static boolean isPerfect(int n , int i , int sum){
//        if(i==0) return sum==n;
//
//        if(n%i == 0) sum+=i;
//        return isPerfect(n, i- 1, sum);
//    }
//
//    public static void range(int st, int end){
//        if(st>end) return;
//        if(isPerfect(st,st/2,0))
//        System.out.println(st);
//        range(st+1,end);
//    }
//
//}


package recurrsion;

public class isPerfect{
    public static void main(String[] args) {

       // int n = 6;
        // System.out.println(isPerfect(n, n / 2, 0)); // Test for single number

        range(1, 10);
    }

    public static boolean isPerfect(int n, int i, int sum){
        if(i == 0) return sum == n;

        if(n % i == 0) sum += i;
        return isPerfect(n, i - 1, sum);
    }

    public static void range(int st, int end){
        if(st > end) return;
        if(isPerfect(st, st/2, 0))
            System.out.println(st);
        range(st + 1, end);
    }
}
