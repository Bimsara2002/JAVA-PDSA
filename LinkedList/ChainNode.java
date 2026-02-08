package LinkedList;

public class ChainNode {
    Object data;
    ChainNode next;

    //constructor with one parameter
    public ChainNode(Object d) {
        this.data = d;
        this.next = null; //by default next is null
    }
    //constructor with two parameters
    ChainNode(Object d, ChainNode n){
        this.data = d;
        this.next = n; //next is assigned to n
    }
}
