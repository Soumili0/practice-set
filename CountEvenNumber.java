//Count even numbers in an array
import java.util.*;
public class CountEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int count =0;
         for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
         }
         System.out.println("number of even numbers in the array is:"+count);
    }
}
