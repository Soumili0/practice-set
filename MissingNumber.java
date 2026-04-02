/*import java.util.*;
public class MissingNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        for(int i=0;i<n-1;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
        }
        System.out.println(set);
    }
}
*/
import java.util.*;
public class MissingNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        int arr[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();        }
        
    int arrSum=0;
    for(int i=0;i<n-1;i++){
        arrSum+=arr[i];
    }   
int ans = sum-arrSum;
System.out.println(ans);
}
}
/*
using xor
int xor1=0;
for(int i=1;i<=n;i++){
    xor1^=i;
}
    int xor2=0;
    for(int i=0;i<n-1;i++){
        xor2^=arr[i];
    }
int ans = xor1^xor2;
System.out.println(ans);
*/
