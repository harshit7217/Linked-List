package doublyLinkedList.insertionAndDeletion;

import doublyLinkedList.DDLNode;

public class TraversingLinkedList {
    public synchronized void traversingLinkedList(DDLNode node){
        DDLNode temp = node;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
