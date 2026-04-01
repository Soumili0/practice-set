
import java.util.*;
public class MovesZeroes {
    public static void moveZeroes(int[] arr) {
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;

            }
        }
}

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
}

}