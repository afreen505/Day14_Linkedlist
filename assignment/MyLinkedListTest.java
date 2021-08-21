package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void InsertingAnElementInASortedOrderInLinkedList() {
        System.out.println("----TASK----");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.SortedAdding(myFirstNode);
        myLinkedList.SortedAdding(mySecondNode);
        myLinkedList.SortedAdding(myThirdNode);
        myLinkedList.SortedAdding(myFourthNode);

        MyLinkedList checkLinkedList = new MyLinkedList();
        MyNode<Integer> myFirstNode1 = new MyNode<>(56);
        MyNode<Integer> mySecondNode2 = new MyNode<>(30);
        MyNode<Integer> myThirdNode3 = new MyNode<>(46);
        MyNode<Integer> myFourthNode4 = new MyNode<>(70);
        checkLinkedList.addToBack(myFirstNode1);
        checkLinkedList.addToBack(mySecondNode2);
        checkLinkedList.addToBack(myThirdNode3);
        checkLinkedList.addToBack(myFourthNode4);

        System.out.println("Unsorted linked list is : ");
        checkLinkedList.printMyNodes();
        System.out.println();
        System.out.println("Linked list after sorting is : ");
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
    }
}