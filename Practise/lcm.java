public class lcm {
    public static void main(String[] args) {

        int a = 3,  b = 4;

        int n = a>b ? a : b;
        int i = n;

        while(true){
            if(n%a==0 && n%b==0)break;

            n+=1;
        }
    }
}
