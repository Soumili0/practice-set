import java.util.*;
public class SecondLargest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
int largest = arr[0];
int secondlargest = -1;
for(int i=0;i<n;i++){
    if(arr[i]>largest){
    
        secondlargest = largest;
        largest = arr[i];
    }
    else if(arr[i]>secondlargest && arr[i]!= largest){
        secondlargest = arr[i];
    }
}
System.out.println(secondlargest);
    }
}
