class Solution {
    public String longestCommonPrefix(String[] str) {
        // Edge case: if the array is empty or null
        if (str == null || str.length == 0) {
            return "";
        }
        
        // Take the first string as a baseline for comparison
        String firstStr = str[0];
        
        // Iterate through each character of the first string
        for (int i = 0; i < firstStr.length(); i++) {
            char ch = firstStr.charAt(i);
            
            // Check this character against all other strings
            for (int j = 1; j < str.length; j++) {
                // If the current string is shorter than 'i', or characters don't match
                if (i == str[j].length() || str[j].charAt(i) != ch) {
                    // Return the substring from 0 to i-1
                    return firstStr.substring(0, i);
                }
            }
        }
        
        // If we finished the loop, the entire first string is the common prefix
        return firstStr;
    }
}
