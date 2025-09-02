package recurrsion;

//public class Main {
//    public static void main(String[] args) {
//
//        Main  main = new Main();
//        main.m(1,1.0);
//        main.m(10.0,20.0);
//        main.m(1,1);
//
//    }
//    void m(int a, double b){
//        System.out.println("m with int and double printed:");
//    }
//
//    void m(double a, double b){
//        System.out.println("m with double and double printed:");
//    }
//
//
//}


public class Main {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}