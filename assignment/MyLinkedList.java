package com.linkedlist.assignment;

public class MyLinkedList {
    public INode head;
    public INode tail;

    MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToBack(INode newNode) {
        // TODO Auto-generated method stub
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(tail);
        }
    }

    public INode deleteFirstElementInLinkedList() {
        INode DeletedFirstNode = head;
        INode tempNode = head.getNext();
        head = tempNode;
        return DeletedFirstNode;
    }

    public void printMyNodes() {
        System.out.println("Head is : " + head.getKey());
        System.out.println("Tail is : " + tail.getKey());
        System.out.println("My Nodes are : ");
        INode tempNode = head;
        while (tempNode != tail) {
            System.out.print(tempNode.getKey());
            if (!tempNode.equals(tail))
                System.out.print(" -> ");
            tempNode = tempNode.getNext();
        }
        System.out.print(tempNode.getKey());
    }
}