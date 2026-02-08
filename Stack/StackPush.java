public class StackPush {
    int arr[];
    int top;
    int capacity;

    StackPush(int size) {
        arr = new int[size]; // Create an array to hold the stack elements
        capacity = size; // Set the capacity of the stack
        top = -1; // Initialize top to -1 to indicate an empty stack
    }
    // Check if the stack is full
    boolean isFull() {
        return top+1 == capacity; // Stack is full if top + 1 equals capacity
    }
    // Push an item to the stack
    public void push(int x){
        if(isFull()){ 
            System.out.println("Stack overflow"); 
        }
        else{
            top++; // Increment top to point to the next position
            arr[top] = x; // Add the new element to the stack
            System.out.println(x + " pushed to stack"); // for testing
        }
    }
        // Driver code to test the stack implementation    
        public static void main(String[] args) {
            StackPush myStack = new StackPush(5); // Create a stack of capacity 5

            myStack.push(10); // Push elements to the stack
            myStack.push(20);
            myStack.push(30);
            myStack.push(40);
            myStack.push(50);
            myStack.push(60); // This will cause stack overflow
 
        }
    }
