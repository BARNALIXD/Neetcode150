package Blocks;

public class Pen {
     static int x =10;
     static
     {
         x=20;
     }

    public static void main(String[] args)
    {
        System.out.println(x);
    }
    {
        x=30;
    }
}
