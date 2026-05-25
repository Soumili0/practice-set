import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int k, int remainingSum, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        // Base case: If we have picked exactly k numbers
        if (currentCombination.size() == k) {
            // If they sum up to n, add a copy of the combination to our results
            if (remainingSum == 0) {
                result.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        // Optimization: If remainingSum becomes negative, no need to proceed
        if (remainingSum < 0) {
            return;
        }

        // Try picking numbers from 'start' up to 9
        for (int i = start; i <= 9; i++) {
            // Include i in the current combination
            currentCombination.add(i);
            
            // Move to the next number (i + 1) and decrease the remaining sum
            backtrack(k, remainingSum - i, i + 1, currentCombination, result);
            
            // Backtrack: remove the last element to try the next option
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
