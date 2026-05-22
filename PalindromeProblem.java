import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> currentPartition = new ArrayList<>();
        backtrack(s, 0, currentPartition, result);
        return result;
    }

    private void backtrack(String s, int start, ArrayList<String> currentPartition, ArrayList<ArrayList<String>> result) {
        // Base case: If we've reached the end of the string, record the partition
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        // Explore all possible substrings starting from 'start'
        for (int i = start; i < s.length(); i++) {
            // Check if the substring s[start...i] is a palindrome
            if (isPalindrome(s, start, i)) {
                // Choose: add the current substring to the partition list
                currentPartition.add(s.substring(start, i + 1));
                
                // Explore: move to the next remaining part of the string
                backtrack(s, i + 1, currentPartition, result);
                
                // Unchoose: backtrack for the next iteration/choices
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    // Helper method to check if a substring s[low...high] is a palindrome
    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
