package Constructors;

public class Bike {

    Bike(int cost){
        System.out.println("Cost: "+cost);
    }

    public static void main(String[] args) {
        Bike b = new Bike(60);
    }
}
