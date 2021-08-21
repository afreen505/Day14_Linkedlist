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

    public boolean SearchAnElementInALinkedList(Integer elementValue) {
        // TODO Auto-generated method stub
        INode pointerNode = head;
        while(pointerNode!=tail) {
            if(pointerNode.getKey() == elementValue) {
                System.out.println("Element found");
                return true;
            }
            pointerNode = pointerNode.getNext();
        }
        if(pointerNode.getKey() == elementValue) {
            System.out.println("Element found");
            return true;
        }
        System.out.println("Element not found");
        return false;
    }

    public boolean InsertingAnElementAfterAnElementInALinkedList(Integer specifiedElement, INode newNode) {
        // TODO Auto-generated method stub
        if(SearchAnElementInALinkedList(specifiedElement)) {
            INode pointerNode = head;
            while(pointerNode!=tail) {
                if(pointerNode.getKey() == specifiedElement) {
                    newNode.setNext(pointerNode.getNext());
                    pointerNode.setNext(newNode);
                    return true;
                }else {
                    pointerNode = pointerNode.getNext();
                    continue;
                }
            }
        }else {
            return false;
        }
        return false;
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