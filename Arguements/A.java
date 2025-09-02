package ARGUEMENTS;

public class A {
    public static void main(String[] args) {
        int a = 10;
        m1(a);
        System.out.println("a= "+a);
    }

    static void m1(int a ){
        a*= 3;
        System.out.println(" in m1, a=" +a);
    }
}
