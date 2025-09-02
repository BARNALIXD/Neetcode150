import java.util.Scanner;

public class perfect1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i< num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("it is a perfect num");
        }else{
            System.out.println("it is not a perfect number");
        }
sc.close();
    }
}
