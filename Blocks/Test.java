package Blocks;

public class Test {

    {
        System.out.println("non static block");
    }

    {
        System.out.println("non static block 2");
    }


    public static void main(String[] args) {
        System.out.println("hi");
         Test t1 = new Test();
        System.out.println("end");
    }
}
