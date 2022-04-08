package main;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given4ElementWhenAnElementDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(mySecondNode);
        myLinkedList.appendNode(myThirdNode);
        myLinkedList.appendNode(myFourthNode);
        myLinkedList.popElement(myThirdNode);


        boolean result = myLinkedList.getHead().equals(myFirstNode) && myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myFourthNode) && myLinkedList.size() == 3;
        Assert.assertTrue(result);
    }

    @Test
    public void given4NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(mySecondNode);
        myLinkedList.appendNode(myThirdNode);
        myLinkedList.insert(mySecondNode, myFourthNode);

        boolean result = myLinkedList.getHead().equals(myFirstNode) && myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getHead().getNext().getNext().equals(myFourthNode) && myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenAnElementSearchedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(mySecondNode);
        myLinkedList.appendNode(myThirdNode);

//        System.out.println(myLinkedList.search(mySecondNode.getKey()).getKey());

        boolean result = myLinkedList.search(mySecondNode.getKey()).getKey().equals(mySecondNode.getKey()) &&
                myLinkedList.search(myFirstNode.getKey()).getKey().equals(myFirstNode.getKey()) &&
                myLinkedList.search(myThirdNode.getKey()).getKey().equals(myThirdNode.getKey());
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.popLast();

        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getTail().equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.pop();

        boolean result = myLinkedList.getHead().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.appendNode(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);

        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

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
