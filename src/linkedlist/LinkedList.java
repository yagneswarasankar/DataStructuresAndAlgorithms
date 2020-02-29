package linkedlist;

import sun.awt.image.ImageWatched;

class LinkedList {

    Node head = null;
    Node tail = null;
    Node node;

    public void insertAtFirst(int data){
        if(head == null)
            head.data = data;
        else
            node.data = data;
            head =  node;
            tail = node;

    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtFirst(5);


    }


    }



