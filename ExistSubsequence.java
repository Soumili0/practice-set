class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return helper(0, 0, nums, k);
    }
    
    private boolean helper(int index, int currentSum, int[] nums, int k) {
        // Base Case 1: If the current sum equals k, we found a valid subsequence
        if (currentSum == k) {
            return true;
        }
        
        // Base Case 2: If we reach the end of the array or sum exceeds k, stop exploring
        if (index == nums.length || currentSum > k) {
            return false;
        }
        
        // Choice 1: Pick the current element
        if (helper(index + 1, currentSum + nums[index], nums, k)) {
            return true;
        }
        
        // Choice 2: Skip the current element (Don't Pick)
        if (helper(index + 1, currentSum, nums, k)) {
            return true;
        }
        
        return false;
    }
}
