package Blocks;

public class Employee {
    int id;
    {
        System.out.println("initializing id to 10");
        id=10;
    }

    public static void main(String[] args) {
        Employee e= new Employee();

        System.out.println("Id: "+e.id);
    }
    {
        System.out.println("initializing id to 20");
        id=20;
    }
}
