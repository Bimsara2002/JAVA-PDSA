public class Reverse {
    char arr[];
    int top;
    int capacity;

    Reverse(int size){
        arr = new char[size];
        capacity = size;
        top = -1;
    }
    // Check if the stack is full
    boolean isFull(){
        return top+1 == capacity;
    }
    // check if the stack is Empty
    boolean isEmpty(){
        return top == -1; 
    }
    public void push(char x){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println(x +" Pushed to Stack");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(arr[top] + " pop from the stack");
            top--;
        }
    }
         
    public static void main(String[] args) {
        Reverse R1 = new Reverse(4);

        R1.push('B');
        R1.push('I');
        R1.push('M');
        R1.push('A');
        R1.pop();
        R1.pop();
        R1.pop();
        R1.pop();
    }
    
}
