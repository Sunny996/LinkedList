package main;

public class MyLinkedList<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void appendNode(INode<K> newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = tempNode.getNext();
        return tempNode;
    }

    public INode<K> popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode<K> search(K key) {
        INode tempNode = head;

        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key))
                break;
            else
                tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public INode<K> getHead() {
        return head;
    }

    public void setHead(INode<K> head) {
        this.head = head;
    }

    public INode<K> getTail() {
        return tail;
    }

    public void setTail(INode<K> tail) {
        this.tail = tail;
    }
}
