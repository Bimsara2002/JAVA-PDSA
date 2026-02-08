public class Stack {
    int arr[];
    int top;
    int capacity;

    // Constructor to initialize the stack
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    // Check if the stack is full
    boolean isFull(){
        return top+1 == capacity;
    }
    // Check if the stack is empty
    boolean isEmpty(){
        return top == -1;
    }
    // Push an item to the stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println(x + " pushed to stack"); // for testing
        }
    }
    // Pop an item from the stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Popped from stack " + arr[top]); // for testing
            top--;     
        }
    }
    // Peek the top item from the stack
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is " + arr[top]); // for testing
        }
    }
    // Get the size of the stack
    public void size(){
        System.out.println("Stack size is " + (top+1)); // for testing
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(5); //object of stack with capacity 5

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.pop();
        myStack.pop();
        myStack.peek();
        myStack.size();
    }
}
