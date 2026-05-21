class Solution {
    public boolean isomorphicString(String s, String t) {
        // If lengths are different, they cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store the last seen positions/mappings of characters
        // Initialized to 0 by default in Java
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the current mapping doesn't match the previous mapping profile
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Record the current position (using i + 1 to avoid conflict with default 0)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
