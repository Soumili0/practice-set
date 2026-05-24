import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String currentString, int open, int close, int max) {
        // Base case: If the current string reaches the maximum required length (2 * n)
        if (currentString.length() == max * 2) {
            result.add(currentString);
            return;
        }

        // Decision 1: We can always add an opening parenthesis if we haven't hit the limit 'n'
        if (open < max) {
            backtrack(result, currentString + "(", open + 1, close, max);
        }

        // Decision 2: We can only add a closing parenthesis if it matches an already open one
        if (close < open) {
            backtrack(result, currentString + ")", open, close + 1, max);
        }
    }
}
