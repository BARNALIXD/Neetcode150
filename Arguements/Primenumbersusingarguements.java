package ARGUEMENTS;

public class Primenumbersusingarguements {
    public static void main(String[] args) {
        displayprime(10,40);
    }
    static void displayprime(int a, int b){
        for(int i = a; i<=b ;i++){
            if(isPrime(i)) System.out.println(i);
        }
    }

    static boolean isPrime(int n ){
        if(n<=1) return false;

        for (int i = 2; i <n/2 ; i++) {
            if(n%i ==0) return false;
        }
        return true;
    }
}
