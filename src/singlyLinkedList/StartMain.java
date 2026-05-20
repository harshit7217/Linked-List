package singlyLinkedList;

import singlyLinkedList.insertedAndDeleteElements.LinkedList;

public class StartMain {
    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        ListNode listNode1 =  new ListNode(2);
        listNode.setNext(listNode1);
        ListNode listNode2 = new ListNode(3);
        listNode1.setNext(listNode2);
//The display of the linked of the list
        TraversingLinkedList traversingLinkedList = new TraversingLinkedList();
        System.out.println("Displaying the list : ");
        traversingLinkedList.traversing(listNode);

//        Implementation of the LinkedList Insert at Beginning
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBegin(new ListNode(1));
        linkedList.insertAtBegin(new ListNode(2));
        System.out.println("Insert at Beginning");
        ListNode head = linkedList.getHead();
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        int length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//        Implementation of the linked list Insert at ending
        linkedList.insertAtEnding(new ListNode(3));
        System.out.println("Insert at Ending");
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//       Implementation of the linked list Insert at position
        linkedList.insertAtPosition(4, 1);
        linkedList.insertAtPosition(7, 5);
        linkedList.insertAtPosition(6, 5);
        System.out.println("Insert At any position");
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//        Implementation of the linked list deletion at beginning
        ListNode removingNode =  linkedList.removeAtBegin();
        System.out.println("Removing data : "+ removingNode.getData());
        System.out.println("Removing at beginning");
        head = linkedList.getHead();
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//       Implementation of the linked list deletion at ending
        removingNode = linkedList.removeAtEnding();
        System.out.println("Removing data : "+ removingNode.getData());
        System.out.println("Removing at ending");
        head = linkedList.getHead();
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//        Implementation of the linked list deletion of the matching node
        linkedList.removingMatchedNode(head);
        System.out.println("Removing at matching node");
        head = linkedList.getHead();
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//        Implementation of the linked list deletion of the positon of the list
        linkedList.removingAtPostion(1);
        System.out.println("Removing at position of node");
        traversingLinkedList.traversing(head);

//        Implementation of the linked list length
        length = linkedList.getLength();
        System.out.println("The length of the linked list : "+ length);

//        Implementation of the linked list into string
        String linkedListString = linkedList.toString();
        System.out.println("The string of the linked list");
        System.out.println(linkedListString);

//        Implementation of finding the position of the given data
        int position = linkedList.getPosition(7);
        System.out.println("The position of data 7 : "+ position);

//        Implementation of removing everything in linked list
        linkedList.clear();

    }
}
