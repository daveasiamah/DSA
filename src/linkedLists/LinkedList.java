package linkedLists;

public class LinkedList {
    private static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void addHead(int item){
        var node = new Node(item);

        if(head == null)
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
    }

    public void addTail(int item){
        var node = new Node(item);
        if(head == null)
            head = tail = node;
        else{
            head.next = node;
            tail = node;
        }
    }

    public Node  reverseLinkedList(Node node){
        Node current = node;
        Node prev = null;

        while(current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }
        return prev;
    }

}
