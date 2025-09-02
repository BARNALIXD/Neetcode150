import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = sc.nextInt();

        int prod = 1;
        for (int i = 1; i <=n ; i++) {
            prod *= i;


        }
        System.out.println("fact of " +n+ "=" + prod);
    }
}
