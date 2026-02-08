public class Reverse2 {
    char arr[];
    int top;
    int capacity;

    Reverse2(int size) {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    boolean isFull() {
        return top + 1 == capacity;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return '\0'; // Return null character if stack is empty
        } 
        else {
            return arr[top--];
        }
    }

    public static void main(String[] args) {

        String name = "BIMSARA";   // full name
        Reverse2 stack = new Reverse2(name.length());

        // Push all characters
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }

        // Pop and build reversed name
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        
        System.out.println("Original Name : " + name);
        System.out.println("Reversed Name : " + reversed);
    }
}