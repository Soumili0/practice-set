class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are different, s can never become goal
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself
        String doubledString = s + s;
        
        // Check if goal exists as a substring inside the doubled string
        return doubledString.contains(goal);
    }
}
