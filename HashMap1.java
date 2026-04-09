/*Given an array find the most frequent element
on it.If there are multiple elements that appeard 
multiple number of times print any one of them .
*/
import java.util.*;
public class HashMap1{
   /*  static void Hashmethods(){
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("Akash",20);
        hm.put("Rohit",21);
        hm.put("Satyarth",22);
        hm.get("Rohit");
hm.put("Akash", 26);
    }*/
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
            
        }
        int max =0;
        int ans =0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
System.out.println(ans);
    }
}
