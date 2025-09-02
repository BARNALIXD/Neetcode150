package FinalModifiers;

public class A {
    public static final int i ;

    static {
        i = 10;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
