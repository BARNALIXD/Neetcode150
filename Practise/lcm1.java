import java.util.Scanner;

public class lcm1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num:");
        int a = sc.nextInt();
        System.out.println("enter the seconfd number");
        int b = sc.nextInt();

        int n = (a < b)? a : b;
        int i = n;

        while(true){
            if(n%a==0 && n%b==0) break;
            n+= i;
        }
        System.out.println(n);
    }
}