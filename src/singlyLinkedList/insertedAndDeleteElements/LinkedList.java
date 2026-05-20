package singlyLinkedList.insertedAndDeleteElements;

import singlyLinkedList.ListNode;

public class LinkedList {
//    Default Constructor
    public LinkedList(){
        length = 0;
    }
    private ListNode head;
//    Returning the head of the node
    public synchronized ListNode getHead(){
        return this.head;
    }

//    Length of LinkedLit
    private int length = 0;

//    Insert a Node in beginning of this list
    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

//    Insert a node in ending of the list
    public synchronized void insertAtEnding(ListNode node){
        if(head == null){
            head = node;
        }else {
            ListNode currentNode = head;
            ListNode previousNode = null;
            while (currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            previousNode.setNext(node);
        }
        length++;
    }

//    Insert a node in position of the list
    public synchronized void insertAtPosition(int data, int position){
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length;
        }

        if(head == null){
            head = new ListNode(data);
        }else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        }else {
            ListNode temp = head;
            for(int i=1; i<position; i++){
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

//    Deletion a node at the beginning
    public synchronized ListNode removeAtBegin(){
        ListNode node = head;
        if(node != null){
            head = node.getNext();
            node.setNext(null);
        }
        length--;
        return node;
    }

//    Deletion a node at the ending
    public synchronized ListNode removeAtEnding(){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode next = head.getNext();
        ListNode previous = null;

        if(next == null){
            head = null;
            return current;
        }
        while ((next = current.getNext()) != null){
            previous = current;
            current = current.getNext();
        }
            assert previous != null;
            previous.setNext(null);
           length--;
        return current;
    }


//    Deleting a node in the match of the node
    public synchronized void removingMatchedNode(ListNode node){
        if(head == null){
            return ;
        }

        if(head.equals(node)){
            head = head.getNext();
            length--;
            return ;
        }

        ListNode current = head, previous = null;

        while((previous = current.getNext()) != null) {
            if (node.equals(previous)) {
                current.setNext(previous.getNext());
                length--;
                return;
            }
            current = previous;
        }
    }

//    Deleting a node in position
    public synchronized void removingAtPostion(int position){
        if(position < 0){
            position = 0;
        }

        if(position > length){
            position = length;
        }

        if(head == null){
            return;
        }else if(position == 0){
            head = head.getNext();
            return;
        }else {
            ListNode temp = head;
            for(int i=1; i<position; i++){
                temp = temp.getNext();
            }

            ListNode node = temp.getNext();
            temp.setNext(node.getNext());
        }
        length--;
    }

//    Return a Linked List into string
    public synchronized String toString(){
        String result = "[";
        if(head == null){
            result += "]";
            return result;
        }

        result +=  head.getData();
        ListNode temp = head.getNext();

        while(temp != null){
            result = result + "," + temp.getData();
            temp = temp.getNext();
        }

        return result + "]";
    }

//    Length of the linked list
    public synchronized int getLength(){
        return length;
    }

//    Finding a positon of the given data
    public synchronized int getPosition(int data){

        ListNode temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.getData() == data){
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }

        return Integer.MIN_VALUE;
    }

//    Clear a linked list
    public synchronized void clear() {
        head = null;
        length = 0;
    }
}
