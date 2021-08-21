package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToBottom() {
        System.out.println("----TASK 2----");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToBack(myFirstNode);
        myLinkedList.addToBack(mySecondNode);
        myLinkedList.addToBack(myThirdNode);

        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}