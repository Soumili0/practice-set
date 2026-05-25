import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // Sort the array to easily handle duplicates and handle elements in order
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombinations(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        // Base case: if target reaches 0, we found a valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            // If the current element is greater than the remaining target, 
            // no point in moving forward since the array is sorted
            if (arr[i] > target) break;

            // Skip duplicate elements to ensure unique combinations
            if (i > ind && arr[i] == arr[i - 1]) continue;

            // Pick the element
            ds.add(arr[i]);
            // Move to the next index (i + 1) because each number can only be used once
            findCombinations(i + 1, arr, target - arr[i], ds, ans);
            // Backtrack: remove the element before the next iteration
            ds.remove(ds.size() - 1);
        }
    }
}
