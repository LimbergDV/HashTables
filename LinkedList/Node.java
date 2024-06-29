package LinkedList;

import Business.Business;

public class Node {
    private Business business;
    private Node next; //reference to next node


    public Node(Business business){
        this.business = business;
        this.next = null;
    }

    //getters and setters by Object Data
    public Business getBusiness() {
        return business;
    }

    public void setData(Business business) {
        this.business = business;
    }

    //getters and setter by Node next
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
