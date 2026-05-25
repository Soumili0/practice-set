class Solution {
    public boolean anagramStrings(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Array to store frequencies of 26 lowercase English letters
        int[] charCounts = new int[26];
        
        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        
        // If all counts are 0, then t is an anagram of s
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
