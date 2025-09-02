package INNERCLASSE;

public class A {

    int i =10;
    static int j = 20;

    static class B {
        public void m1(){
            //System.out.println(i);
            System.out.println(j);
        }

        public static void main(String[] args) {
            {
                System.out.println("Main method of B");
            }
        }

    }
    public static void main(String[] args) {
        A.B b = new A.B();
        b.m1();
    }
}
