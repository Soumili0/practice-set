import java.util.*;
public class Factorial {
static int factorialNumber(int n){
    if(n==0 || n==1)return 1;
    return n*factorialNumber(n-1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("factorial="+factorialNumber(n));
    }
}
