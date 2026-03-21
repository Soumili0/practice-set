import java.util.*;
public class practice{
    static int print(int n){
        if(n==0||n==1)
 return 1;
return n *print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}