package ARGUEMENTS;

public class b {
    public static void main(String[] args) {
        int i = 0;
        int j = m1(++i) + m1(i++) + m1(++i); // evaluate m1 with updated i values

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    static int m1(int a) {
        return a++;
    }
}
