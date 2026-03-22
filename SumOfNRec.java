import java.util.*;
// parameterised way of recursion
/*public class SumOfNRec {
    static void fun(int i,int sum){
        if(i<1)
        {
            System.out.println(sum);
        return;
        }
        fun(i-1,sum+i);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n,0);
    }
}*/
// functional way of recursion
public class SumOfNRec{
    static int fun(int n){
        if(n ==0) return 0;
        return n+fun(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}
