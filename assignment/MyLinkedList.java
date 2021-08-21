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

    public void SortedAdding(MyNode<Integer> currentNode) {
        // TODO Auto-generated method stub
        if (tail == null) {
            this.tail = currentNode;
        }
        if (head == null) {
            this.head = currentNode;
        } else {
            INode tempNode = head;
            INode previousNode = head;
            if (currentNode.getKey().compareTo((Integer) tempNode.getKey()) > 0) {
                while (currentNode.getKey().compareTo((Integer) tempNode.getKey()) > 0 && tempNode.getNext() != null) {
                    previousNode = tempNode;
                    tempNode = tempNode.getNext();
                }
                if (currentNode.getKey().compareTo((Integer) tempNode.getKey()) < 0) {
                    INode frontNode = tempNode;
                    currentNode.setNext(frontNode);
                    previousNode.setNext(currentNode);
                } else {
                    tempNode.setNext(currentNode);
                    tail = currentNode;
                }
            } else {
                currentNode.setNext(head);
                head = currentNode;
            }
        }
    }

    public void printMyNodes() {
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