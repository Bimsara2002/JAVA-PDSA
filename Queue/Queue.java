package Queue;

public class Queue {
    int front;
    int rear; 
    int capacity;
    int noItem;

    int queueArr[];

    public Queue(int size) {
        this.capacity = size;
        front = 0;
        rear = -1; 
        noItem = 0;
        queueArr = new int[this.capacity];

    }
    boolean isFull(){
        return rear+1 == capacity;
    }
    boolean isEmpty(){
        return front>rear;
    }

    void enQueue (int x){ // add an item to the queue
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            queueArr[rear] = x;
            System.out.println(x + " enqueued to the queue");
        }
    }
    void deQueue (){ // remove an item from the queue
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Dequeue to the queue " +queueArr[front]);
            front++;
            return;

        }
    }
    void display(){
            for(int i=front; i<=rear; i++){
                System.out.print(queueArr[i] + " ");
            }
    }
    public static void main(String[] args) {
        Queue q1 = new Queue(4);
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.deQueue();
        q1.deQueue();
        q1.display();

    }
}
