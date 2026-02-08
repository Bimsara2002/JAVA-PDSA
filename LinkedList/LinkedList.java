package LinkedList;

public class LinkedList {
    int size;
    ChainNode head;

    //constructor
    public LinkedList() {
        this.size = 0;
        this.head = null; //by default head is null. not yet assigned to any node
    }
    public boolean isEmpty() {
        return head == null; //if head is null, then the list is empty
    }

    public int size(){
        return size; //return the size of the list
    }

    public void addFirst(Object elt){
        if(isEmpty()){
            head = new ChainNode(elt); //create a new node if the list is empty
        }
        else{
            head = new ChainNode(elt, head); //create a new node and assign it to head
        }
        size++; //increment the size of the list
    }
    public void addLast(Object elt){
        if(isEmpty()){
            head = new ChainNode(elt); //create a new node if the list is empty
        }
        else{
            ChainNode current = head; //start from the head
            while(current.next != null){ //traverse the list until the end
                current = current.next; //move to the next node
            }
            current.next = new ChainNode(elt); //add the new node at the end of the list
        }
        size++; //increment the size of the list
    }
    public Object removeFirst(){
        Object removedData = null; //initialize a variable to store the removed data
        if(isEmpty()){
            System.out.println("List is empty. Cannot remove element."); //if the list is empty, print a message
        }
        else{
            removedData = head.data; //store the data of the first node
            head = head.next; //assign the next node to head, effectively removing the first node
            size--; //decrement the size of the list
        }
        return removedData; //return the removed data
    }
}
