import java.util.Stack;

class Solution {
    // Main function to reverse the stack
    public void reverseStack(Stack<Integer> st) {
        // Base case: if the stack is empty, we just return
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int topElement = st.pop();

        // Recursively reverse the remaining stack
        reverseStack(st);

        // Insert the popped element back at the bottom of the reversed stack
        insertAtBottom(st, topElement);
    }

    // Helper function to insert an element at the bottom of a stack
    private void insertAtBottom(Stack<Integer> st, int element) {
        // Base case: if the stack is empty, push the element
        if (st.isEmpty()) {
            st.push(element);
            return;
        }

        // Remove the top element to make way for the new element
        int topElement = st.pop();

        // Recursively call insertAtBottom until the stack becomes empty
        insertAtBottom(st, element);

        // Push the intermediate elements back on top
        st.push(topElement);
    }
}
