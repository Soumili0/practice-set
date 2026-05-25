class Solution {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        int n = nums.length;
        // dp[index][current_sum]
        // Using an Integer array to easily check for uncomputed states (null)
        Integer[][] dp = new Integer[n][k + 1];
        
        return solve(0, k, nums, dp);
    }
    
    private int solve(int ind, int target, int[] nums, Integer[][] dp) {
        // Base Case 1: If target becomes 0, we found a valid subsequence
        if (target == 0) {
            return 1;
        }
        
        // Base Case 2: If we reach the end of the array or target goes negative
        if (ind == nums.length || target < 0) {
            return 0;
        }
        
        // If the state is already computed, return it
        if (dp[ind][target] != null) {
            return dp[ind][target];
        }
        
        // Choice 1: Pick the current element (only if it doesn't exceed the target)
        int pick = 0;
        if (nums[ind] <= target) {
            pick = solve(ind + 1, target - nums[ind], nums, dp);
        }
        
        // Choice 2: Do not pick the current element
        int notPick = solve(ind + 1, target, nums, dp);
        
        // Store and return the total count for this state
        return dp[ind][target] = pick + notPick;
    }
}
