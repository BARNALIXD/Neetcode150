package Constructors;

public class Student {

    String name;
    int age;
    int id;

    Student(String name, int age, int id)  {
        this.name = name;
        this.age= age;
        this.id = id;

    }

    public void display(){
        System.out.println("Student name:" +name);
        System.out.println("student id:" +id);
        System.out.println("Student age:" +age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("barnali",19,26);
        Student s2 = new Student("sam", 25, 19);
        s1.display();
        s2.display();

    }
}