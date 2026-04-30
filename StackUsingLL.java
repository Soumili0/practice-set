// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    //Node top = null;
    //int count =0;
    Node top;
    int count ;
    public myStack() {
        // Initialize your data members
        top = null;
        count=0;
      
    }

    public boolean isEmpty() {
        // check if the stack is empty
      /  if(top==null) return true;
        return false;
            }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
       Node newNode = new Node(x);
       newNode.next = top;
       top = newNode;
       count ++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(top==null)return;
        top=top.next;
        count--;
        
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(top==null)return -1;
        return top.data;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return count;
    }
}
