package singlyLinkedList;

public class TraversingLinkedList {

//    The length of the linked list
    public void traversing(ListNode headNode){

        ListNode currentNode = headNode;
        while(currentNode != null){
            System.out.print(currentNode.getData() +" ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
