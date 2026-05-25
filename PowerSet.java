import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // Total number of subsets is 2^n (1 << n)
        int totalSubsets = 1 << n; 
        
        // Run a loop from 0 to 2^n - 1
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            
            // Check every bit of the binary representation of i
            for (int j = 0; j < n; j++) {
                // If the j-th bit of i is set, include nums[j]
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            // Add the generated subset to our final answer list
            ans.add(subset);
        }
        
        return ans;
    }
}
