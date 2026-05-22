import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        // Start the recursion with an empty string and '0' as the dummy previous character
        backtrack(n, new StringBuilder(), '0', result);
        return result;
    }

    private void backtrack(int n, StringBuilder current, char lastChar, List<String> result) {
        // Base case: If the string reaches the required length, add it to the result
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }

        // Choice 1: We can always append '0'
        current.append('0');
        backtrack(n, current, '0', result);
        current.deleteCharAt(current.length() - 1); // Backtrack

        // Choice 2: We can only append '1' if the previous character was not '1'
        if (lastChar != '1') {
            current.append('1');
            backtrack(n, current, '1', result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
