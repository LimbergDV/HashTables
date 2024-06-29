package LinkedList;

import Business.Business;

public class LinkedList {
    private Node head;
    private int count;

    public LinkedList (){
        this.count = 0;
        this.head = null;
    }

    public void push(Business business){
        Node node = new Node(business);

        if(this.head == null){
            this.head = node;
        }
        else{
            Node current = this.head;
            while(current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(node);
        }
        this.count++;
    }


    public Business getElementAt(int index){
        if (index >= 0 && index<this.count){
            Node node = this.head;
            for(int i = 0;i<index && node != null; i++ ){
                node = node.getNext();
            }
            return node.getBusiness();
        }

        return null;
    }

    public boolean isEmpty(){
        if (this.head != null){
            return false;
        }
        else{
            return true;
        }
    }

    public int size(){
        return this.count;
    }

}
