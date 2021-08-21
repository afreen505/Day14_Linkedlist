package com.linkedlist.assignment;
public class MyLinkedListTest {
    @Test
    public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        System.out.println("----TASK----");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToFront(myFirstNode);
        myLinkedList.addToFront(mySecondNode);
        myLinkedList.addToFront(myThirdNode);

        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

}

