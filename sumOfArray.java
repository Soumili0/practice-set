import java.util.*;
public class sumOfArray {
    static int sumOfArrays(int[]arr,int i){
        if(i==arr.length)
              return 0;
            return arr[i] + sumOfArrays(arr, i+1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int []arr = new int [n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("sum of array:"+sumOfArrays(arr,0));
    }
}
