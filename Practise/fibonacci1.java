public class fibonacci1 {
    public static void main(String[] args) {

        int prev=0,current=1,next=0,n=10;
        System.out.println(prev + " " +current+ " ");
        int count = 2;
        while (count < n){
            next = prev + current;
            System.out.print(next+ " ");
            prev = current;
            current = next;
            count ++;
        }
    }
}
