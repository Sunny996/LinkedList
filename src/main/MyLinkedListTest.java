package main;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.addNode(mySecondNode);
        myLinkedList.addNode(myThirdNode);

        boolean result = myLinkedList.getHead().equals(myThirdNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(mySecondNode);
        myLinkedList.appendNode(myThirdNode);

        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}