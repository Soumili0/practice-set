class Solution {
    public int[] minToMaxHeap(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        
        int n = nums.length;
        
        // Start from the last non-leaf node and heapify each node in reverse order
        for (int i = (n - 2) / 2; i >= 0; i--) {
            maxHeapify(nums, i, n);
        }
        
        return nums;
    }
    
    private void maxHeapify(int[] nums, int index, int size) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        
        // Check if left child exists and is greater than the current largest
        if (leftChild < size && nums[leftChild] > nums[largest]) {
            largest = leftChild;
        }
        
        // Check if right child exists and is greater than the current largest
        if (rightChild < size && nums[rightChild] > nums[largest]) {
            largest = rightChild;
        }
        
        // If the largest element is not the root, swap and continue heapifying
        if (largest != index) {
            int temp = nums[index];
            nums[index] = nums[largest];
            nums[largest] = temp;
            
            // Recursively heapify the affected sub-tree
            maxHeapify(nums, largest, size);
        }
    }
}
