package circularLinkedList;


public class CircularLinkedList {
    protected CLL tail;
    protected int length;

    public CircularLinkedList(){
        tail = null;
        length = 0;
    }

    public CLL getTail(){
        return tail;
    }
//   Counting of the linked list
    public int countCircularLinkedList(){
        CLL currentNode = tail.next;
        int count = 0;
        while(currentNode.equals(tail)){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
//   Traversing
    public void printCircularLinkedList(){
        CLL currentNode = tail.next;
        while(!currentNode.equals(tail)){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

//   Insertion
    public void insertAtFirst(int data){
        CLL newNode = new CLL(data);
        if(tail == null){
            tail = newNode;
            tail.next = newNode;
        }else{
            newNode.next = tail.next;
            tail.next = newNode;
        }
        length++;
    }

    public void insertAtLast(int data){
        insertAtFirst(data);
        tail = tail.next;
    }

//    Peek value
    public int peak(){
        return tail.next.data;
    }

//    Removing
    public void removingFromFirst(){
        CLL current = tail.next;
        if(tail == tail.next){
            tail = null;
        }else {
            tail.next = current.next;
            current.next = null;
        }
        length--;
    }

    public void removingFromLast(){
        CLL current = tail.next;
        while(current.next != tail){
            current = current.next;
        }

        if(current == tail){
            tail = null;
        }else {
            current.next = tail.next;
            tail = current;
        }
        length--;
    }
}
