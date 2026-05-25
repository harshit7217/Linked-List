package doublyLinkedList;

import doublyLinkedList.insertionAndDeletion.DoublyLinkedList;
import doublyLinkedList.insertionAndDeletion.TraversingLinkedList;

public class StartMain {
    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println("Get Data : "+linkedList.get());
        System.out.println("Find a position of data: "+ linkedList.getPosition(Integer.MIN_VALUE));

        DDLNode head = linkedList.getHead();
        System.out.println("Get the head : "+ head.data);

//        Insert a data in front of the linked list
        linkedList.insertAtFront(5);
        linkedList.insertAtFront(20);


//        Traversing the linked List
        System.out.println("Traversing The Linked List at inserting At Front: ");
        TraversingLinkedList linkedList1 = new TraversingLinkedList();
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Insert a data in rear of the linked list
        linkedList.insertAtRear(15);
        linkedList.insertAtRear(25);

//        Traversing the linked List
        System.out.println("Traversing The Linked List at inserting At Rear: ");
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Length of the linked list
        System.out.println("Length of the linked list: "+ linkedList.length());

//        Insert a data in position of the linked list
        linkedList.insertAtPosition(30, 0);
        linkedList.insertAtPosition(40, 3);
        linkedList.insertAtPosition(60, 9);

//        Traversing the linked List
        System.out.println("Traversing The Linked List at inserting At Position: ");
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Deletion start here
//        Deletion a first node of the linked list
        linkedList.deletingFirstNode();
//        linkedList.deletingFirstNode();

//        Traversing the linked List
        System.out.println("Traversing The Linked List at deleting At Front: ");
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Deleting a last node of the doubly linked list
        linkedList.deletingLastNode();

//        Traversing the linked List
        System.out.println("Traversing The Linked List at deleting At Rear: ");
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Deleting a positon of the node
        linkedList.deletingPositionNode(2);
        linkedList.deletingPositionNode(6);

//        Traversing the linked List
        System.out.println("Traversing The Linked List at deleting At Position: ");
        linkedList1.traversingLinkedList(linkedList.getHead());
        System.out.println();

//        Print a data in string format
        String stringLinkedList = linkedList.toString();
        System.out.println(stringLinkedList);

//        clear doubly linked list
        linkedList.clear();
    }
}
