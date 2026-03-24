import java.util.*;
public class SubsequenceAdd {
    static void print(int ind,List<Integer>ds,int s,int sum,int[]arr,int n){
        if(ind ==n){
            if(s==sum){
                for(int x:ds){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[ind]);
        s+=arr[ind];
        print(ind, ds, s, sum, arr, n);

        s-=arr[ind];
        ds.remove(ds.size()-1);
        print(ind, ds, s, sum, arr, n);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        List <Integer>ds = new ArrayList<>();
        print(0,ds,0,sum,arr,n);
    }
    
}
