import java.util.*;
public class MajorityElemnet {
    public static int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }   
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
