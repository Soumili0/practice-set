import java.util.*;
public class SubsequenceRec{
    static void print(int index,int arr[],List<Integer>list){
          if(index>=arr.length){
            System.out.println(list);
            return;
          }
          list.add(arr[index]);
          print(index+1, arr, list);

          list.remove(list.size()-1);
          print(index+1,arr,list);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer>list = new ArrayList<>();
        System.out.println("the sequences are:");
        print(0,arr,list);
    }
}