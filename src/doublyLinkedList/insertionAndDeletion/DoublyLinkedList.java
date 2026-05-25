package doublyLinkedList.insertionAndDeletion;

import doublyLinkedList.DDLNode;

public class DoublyLinkedList {
    private DDLNode head;
    private DDLNode tail;
    private int length;

//    Create a empty List
    public DoublyLinkedList(){
        head = new DDLNode(Integer.MIN_VALUE, null, null);
        tail = new DDLNode(Integer.MIN_VALUE, head, null);
        head.next = tail;
        length = 0;
    }

    public int get() {
        return Integer.MIN_VALUE;
    }

//    Get the position of the Node
    public int getPosition(int data){
        DDLNode temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.getData() == data){
                return pos;
            }
            pos = pos + 1;
            temp = temp.getNext();
        }

        return  Integer.MIN_VALUE;
    }

//    Finding the length of the Linked List
    public int length(){
        return length;
    }

//    Insert a data in front of the linked list
    public void insertAtFront(int data){
        DDLNode newNode = new DDLNode(data);
        newNode.next = head.data == Integer.MIN_VALUE ? head.next : head;
        newNode.next.prev = newNode;
        head = newNode;
        length++;
    }

//    Insert a data in rear of the linked list
    public void insertAtRear(int data){
        DDLNode newNode = new DDLNode(data, null, null);
        newNode.prev = tail.data == Integer.MIN_VALUE ? tail.prev : tail;
        newNode.prev.next = newNode;
        tail = newNode;
        length++;
    }

//    Insert a data in position of the linked list
    public synchronized void insertAtPosition(int data, int pos){
        if(pos < 0){
            pos = 0;
        }

        if(pos > length){
            pos = length;
        }

        if(pos == 0){
            insertAtFront(data);
        }else if(pos == length){
            insertAtRear(data);
        }else {
            DDLNode temp = head;
            for(int i=1; i<pos; i++){
                temp = temp.next;
            }
            DDLNode newNode = new DDLNode(data, temp, temp.next);
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        length++;
    }

//    Return the head
    public synchronized DDLNode getHead(){
        return this.head;
    }

//    Deletion start here
//    Deleting a first node in doubly linked list
    public synchronized void deletingFirstNode(){
        DDLNode temp = head;
        head = temp.next;
        temp = null;
        head.prev = null;
        length--;
        if(length < 0){
            length = 0;
        }
    }

//    Deleting a last node in doubly linked list
    public synchronized void deletingLastNode() {
        DDLNode temp = tail;
        tail = temp.prev;
        temp = null;
        tail.next = null;
        length--;
        if(length < 0){
            length = 0;
        }
    }

//    Deleting a position node of the doubly linked list

    public synchronized void deletingPositionNode(int pos){
        if(pos < 0){
            pos = 0;
        }

        if(pos > length){
            pos = length;
        }

        if(pos == 0){
            deletingFirstNode();
        }else if(pos == length){
            deletingLastNode();
        }else {
            DDLNode temp = head;
            for(int i=1; i<pos; i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        length--;
        if(length < 0){
            length = 0;
        }
    }

//    Print a data in string form
    public synchronized  String toString(){
        String result = "[";
        if(length == 0) return result +"]";
        result = result + head.data;
        DDLNode temp = head.next;
        while(temp != null){
            result += "," + temp.data;
            temp = temp.next;
        }
        result += "]";
        return result;
    }

//    Removing everything from the list
    public void clear(){
        head = null;
        tail = null;
        length = 0;
    }
}
