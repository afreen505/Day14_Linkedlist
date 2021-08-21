package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {
    @Test
    public void SearchLinkedListForAnElement() {
        System.out.println("----TASK----");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToBack(myFirstNode);
        myLinkedList.addToBack(mySecondNode);
        myLinkedList.addToBack(myThirdNode);

        myLinkedList.printMyNodes();
        System.out.println();
        boolean isPresent = myLinkedList.SearchAnElementInALinkedList(30);
        System.out.println();
        System.out.println();
        Assert.assertEquals(true, isPresent);
    }
}