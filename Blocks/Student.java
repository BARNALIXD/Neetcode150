package Blocks;

public class Student {
    static int age;

    static{
        System.out.println("initializing the age to 10 here");
        age=10;
    }

    public static void main(String[] args) {
        System.out.println(Student.age); //age directly can be written there is no such difference
    }

    static{
        System.out.println("initializing the age to 20 here");
        age=20;
    }

}
