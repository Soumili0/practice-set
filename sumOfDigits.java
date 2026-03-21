import java.util.*;
public class sumOfDigits {
    static int sumDigits(int n ){
        if(n==0)return 0;
        return(n%10) + sumDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of Digits="+sumDigits(n));
    }
}
