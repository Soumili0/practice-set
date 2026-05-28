import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 1. Sort the array to use the two-pointer technique
        Arrays.sort(nums);
        
        // Initialize closestSum with the sum of the first three elements
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // If we find an exact match to the target, return it immediately
                if (currentSum == target) {
                    return currentSum;
                }
                
                // If the current sum is closer to the target than our previously recorded closestSum, update it
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move pointers based on how currentSum compares to the target
                if (currentSum < target) {
                    left++; // Sum is too small, make it larger
                } else {
                    right--; // Sum is too large, make it smaller
                }
            }
        }
        
        return closestSum;
    }
}
