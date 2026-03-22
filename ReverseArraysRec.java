
/*import java.util.*;
public class ReverseArraysRec {
    static void fun(int arr[],int s,int e){
        if(s>=e) return;
        swap(arr,s,e);
        fun(arr,s+1,e-1);
    }
    static void swap(int arr[],int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        fun(arr,0,n-1);
        print(arr);
    }
}*/
import java.util.*;
public class ReverseArraysRec{
static void fun(int arr[],int i){
    if(i>arr.length/2) return;
    swap(arr,i,arr.length-1-i);
    fun(arr,i+1);
}
static void swap(int arr[],int s,int e){
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
}
static void print(int arr[]){
    for(int x:arr){ 
        System.out.print(x+" ");
    }
}
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    fun(arr,0);
    print(arr);
}
}