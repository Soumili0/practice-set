class myStack {
int arr[];
int top;
int size;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
        size = n;
        top =-1;
            }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top ==-1) return true;
        return false;
        
    }

    public boolean isFull() {
        // check if the stack is full
        if(top == size -1) return true;
        return false;
         
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(!isFull())
        arr[++top]=x;
       
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(!isEmpty())
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
 if(!isEmpty()){
     return arr[top];
 }      
 return -1;
}
}
