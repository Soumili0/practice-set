import java.util.Stack;

class Solution {
    // Main function to sort the stack
    public void sortStack(Stack<Integer> st) {
        // Base case: if stack is empty, it's already sorted
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int topElement = st.pop();

        // Recursively sort the remaining stack
        sortStack(st);

        // Insert the popped element back in its correct sorted position
        insertSorted(st, topElement);
    }

    // Helper function to insert an element into a sorted stack
    private void insertSorted(Stack<Integer> st, int element) {
        /* Base case: if stack is empty OR the current element is greater 
           than or equal to the top element, push it to the top.
           (Since we want descending order, largest should be at the top)
        */
        if (st.isEmpty() || element >= st.peek()) {
            st.push(element);
            return;
        }

        // If the top element is larger, hold it out and look deeper
        int topElement = st.pop();

        // Recursive call to find the correct spot
        insertSorted(st, element);

        // Put the held element back on top
        st.push(topElement);
    }
}
