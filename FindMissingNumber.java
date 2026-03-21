import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = n*(n+1)/2;
        int arrSum=0;
        for(int x:arr)arrSum+=x;
        System.out.println(sum-arrSum);
    }
}
