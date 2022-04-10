package main;

public class SortedLinkedList<K extends Comparable<K>> extends MyLinkedList<K> {
    private INode<K> head;
    private INode<K> tail;

    public SortedLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void appendNode(INode<K> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (head == tail) {
            if (head.getKey().compareTo(newNode.getKey()) > 0) {
                newNode.setNext(head);
                head = newNode;
                tail = newNode.getNext();
            } else {
                head.setNext(newNode);
                tail = newNode;
            }
        } else {
            if (head.getKey().compareTo(newNode.getKey()) > 0) {
                newNode.setNext(head);
                head = newNode;
                tail = newNode.getNext();
            } else if (tail.getKey().compareTo(newNode.getKey()) < 0) {
                tail.setNext(newNode);
                setTail(newNode);
            }
            INode<K> current1=head, current2=head.getNext();
            while(current1.getNext()!=null){
                if(current1.getKey().compareTo(newNode.getKey()) < 0 && current2.getKey().compareTo(newNode.getKey())>0){
                    newNode.setNext(current2);
                    current1.setNext(newNode);
                    break;
                }
                else{
                    current1=current1.getNext();
                    current2=current2.getNext();
                }
            }

        }
    }

    public void print() {
        INode tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.getKey());
            tempNode = tempNode.getNext();
        }
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
