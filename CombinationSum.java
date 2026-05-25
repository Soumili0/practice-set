import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort to optimize and prune the recursion tree early
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int remain, int start) {
        if (remain == 0) {
            // Found a valid combination, make a deep copy
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Since the array is sorted, if the current element is greater 
            // than the remaining target, all subsequent elements will be too.
            if (candidates[i] > remain) {
                break; 
            }

            // Make a choice
            currentList.add(candidates[i]);
            
            // Recurse: note we pass 'i' instead of 'i + 1' because elements can be reused
            backtrack(result, currentList, candidates, remain - candidates[i], i);
            
            // Undo choice (backtrack)
            currentList.remove(currentList.size() - 1);
        }
    }
}
