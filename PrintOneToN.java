import java.util.*;
public class PrintOneToN {
    static print(int i,int n){
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nectInt();
        int i=1;
        print(i,n);
    }
    
}
