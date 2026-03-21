//Reverse an array
import java.util.*;
public class ReverseArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of elements:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int start = 0;
    int end = n - 1;
    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    System.out.println("reversed array is:");
    for(int x:arr){
        System.out.print(x+" ");
    }
  }  
}
