import java.util.*;
public class powerOfNumber {
    static int power(int x,int n){
        if(n==0)
            return 1;
        return x*power(x, n);
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter base:");
        int x= sc.nextInt();
        System.out.println("enter power:");
        int n = sc.nextInt();
        System.out.println("result:"+power(x,n));
    }
}
