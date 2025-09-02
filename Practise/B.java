public class B {
    int i ;
    int j ;
     public void m1(B b){
         System.out.println(i);
         System.out.println(j);
         System.out.println(b.i);
         System.out.println(b.j);
     }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        b2.i = 10;
        b2.j = 20;

        b1.m1(b2);
    }
}
