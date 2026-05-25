
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> result = new ArrayList<>();
        generateSums(0, 0, nums, result);
        return result;
    }
    
    private void generateSums(int index, int currentSum, int[] nums, List<Integer> result) {
        // Base case: if we have considered all elements
        if (index == nums.length) {
            result.add(currentSum);
            return;
        }
        
        // Choice 1: Include the current element in the sum
        generateSums(index + 1, currentSum + nums[index], nums, result);
        
        // Choice 2: Exclude the current element from the sum
        generateSums(index + 1, currentSum, nums, result);
    }
}
