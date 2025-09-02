package recurrsion;

public class bin_dec {
    public static void main(String[] args) {

        System.out.println(bin_de(1000,1,0));
    }

    public static int bin_de(int n , int count, int sum){
        if(n==0) return sum;

        sum=sum+((n%10)*count);
        return bin_de(n/10,count*2,sum);

    }
}
