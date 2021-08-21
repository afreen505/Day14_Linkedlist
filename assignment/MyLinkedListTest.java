package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {
    @Test
    public void InsertingAnElementAfterASpecifiedElementInLinkedList() {
        System.out.println("----TASK----");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToBack(myFirstNode);
        myLinkedList.addToBack(mySecondNode);
        myLinkedList.addToBack(myThirdNode);

        System.out.println();
        MyNode<Integer> newNode = new MyNode<>(40);
        boolean isInserted = myLinkedList.InsertingAnElementAfterAnElementInALinkedList(30, newNode);
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
        Assert.assertEquals(true, isInserted);
    }
}