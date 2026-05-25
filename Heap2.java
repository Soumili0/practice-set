class Solution {
    public boolean isHeap(int[] nums) {
        int n = nums.length;
        
        // Loop through all internal nodes
        for (int i = 0; i <= (n / 2) - 1; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            // If left child exists and violates the min-heap property
            if (leftChild < n && nums[i] > nums[leftChild]) {
                return false;
            }
            
            // If right child exists and violates the min-heap property
            if (rightChild < n && nums[i] > nums[rightChild]) {
                return false;
            }
        }
        
        return true;
    }
}
