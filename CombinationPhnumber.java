import java.util.ArrayList;
import java.util.List;

class Solution {
    // Mapping of digits to corresponding letters matching a phone keypad
    private static final String[] KEYPAD_MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Edge case: if the input is empty, return an empty list
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Start the backtracking process from index 0
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        // Base case: if we have processed all digits, add the combination to the result
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        char digit = digits.charAt(index);
        String letters = KEYPAD_MAPPING[digit - '0'];

        // Loop through all letters mapped to this digit
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));       // Choose: add the letter
            backtrack(digits, index + 1, current, result); // Explore: move to the next digit
            current.deleteCharAt(current.length() - 1); // Backtrack: remove the letter
        }
    }
}
