package com.linkedlist.assignment;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {
    @Test
    public void DeletingASpecifiedElementInTheLinkedList_And_PrintingTheSizeOfIt() {
        System.out.println("----TASK----");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToBack(myFirstNode);
        myLinkedList.addToBack(mySecondNode);
        myLinkedList.addToBack(myThirdNode);
        myLinkedList.addToBack(myFourthNode);

        System.out.println();
        boolean isDeleted = myLinkedList.DeletingAnElementInALinkedList(40);
        int sizeOfLinkedList = myLinkedList.sizeOfLinkedList();
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
        Assert.assertEquals(true, isDeleted);
        Assert.assertEquals(3, sizeOfLinkedList);
    }
}