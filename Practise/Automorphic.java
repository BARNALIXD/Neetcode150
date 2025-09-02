public class Automorphic {
    public static void main(String[] args) {

        int num = 10;
        int a = 0, b= 1;

        System.out.println("automorphic number" +a+ " " +b);

        for(int i=2;i<=num;i++){
            int c = a+b;
            System.out.println(" " +c);

            a=b;
            b=c;
        }
    }
}
