package circularLinkedList;

public class StartMain {
    public static void main(String[] args){

        CircularLinkedList circularLinkedList = new CircularLinkedList();

//        Insertion in LinkedList
        circularLinkedList.insertAtLast(2);
        circularLinkedList.insertAtLast(3);
        circularLinkedList.insertAtLast(4);
        circularLinkedList.insertAtLast(5);
        circularLinkedList.insertAtLast(6);
        circularLinkedList.insertAtFirst(7);

//        Displaying in Linked List
        circularLinkedList.printCircularLinkedList();

//      Peak Value of the linkedList
        System.out.println("Peak value: "+circularLinkedList.peak());

//        Removing
        circularLinkedList.removingFromFirst();
        circularLinkedList.removingFromFirst();

//        Displaying
        circularLinkedList.printCircularLinkedList();

//        Removing from last
        circularLinkedList.removingFromLast();

//        Displaying
        circularLinkedList.printCircularLinkedList();
    }
}
