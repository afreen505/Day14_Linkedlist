package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {
    @Test
    public void insertANodeInBetweenTwoNodes() {
        System.out.println("----TASK 3----");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToBack(myFirstNode);
        // myLinkedList.addToBack(mySecondNode);
        myLinkedList.addToBack(myThirdNode);

        myLinkedList.insertInBetweenTwoNodes(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

}