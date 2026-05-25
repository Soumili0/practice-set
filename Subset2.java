import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Sort the array to group duplicates together
        Arrays.sort(nums);
        // Start backtracking from index 0
        findSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void findSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        // Add the current subset to the answer list
        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            // If the element is a duplicate at the same level of recursion, skip it
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Include the current element
            current.add(nums[i]);
            
            // Move to the next element
            findSubsets(i + 1, nums, current, ans);
            
            // Backtrack: remove the last element to explore other choices
            current.remove(current.size() - 1);
        }
    }
}
