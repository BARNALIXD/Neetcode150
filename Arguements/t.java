package ARGUEMENTS;

public class t {
    public static void main(String[] args) {
        int a = 10;
        m1(a++);
        System.out.println("in a = "+ a);
    }

    static void m1(int a){
        a*= 3;
        System.out.println("in M" +a);
    }
}
