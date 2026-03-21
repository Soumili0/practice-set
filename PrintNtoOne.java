import java.util.*;
public class PrintNtoOne {
    static void print(int n,int i){
        if(n<i) return;
        System.out.println(n);
        print(n-1,i);
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    print(n,i);
}
}
