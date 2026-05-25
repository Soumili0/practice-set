import java.util.*;

class Solution {
    public List<Character> frequencySort(String s) {
        // Step 1: Count frequencies of each character
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Collect unique characters present in the string
        List<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                uniqueChars.add((char) (i + 'a'));
            }
        }

        // Step 3: Sort based on frequency (descending) and then alphabetically (ascending)
        Collections.sort(uniqueChars, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int freqA = freq[a - 'a'];
                int freqB = freq[b - 'a'];
                
                // If frequencies are different, sort by highest frequency first
                if (freqA != freqB) {
                    return Integer.compare(freqB, freqA);
                }
                // If frequencies are the same, sort alphabetically
                return Character.compare(a, b);
            }
        });

        return uniqueChars;
    }
}
