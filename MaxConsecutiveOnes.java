import java.util.*;
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        maxCount=Math.max(maxCount,count);
        return maxCount;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int ans = obj.findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
