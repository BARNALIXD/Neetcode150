package FinalModifiers;

public class Emp {
    final int id;

   public static int x = 100;

   Emp(){
       id = x;
       x++;
   }

    public static void main(String[] args) {
        Emp e1 = new Emp();
        System.out.println(e1.id);
        Emp e2 = new Emp();
        System.out.println(e2.id);
    }
}
