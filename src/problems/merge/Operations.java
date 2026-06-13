package problems.merge;

import singlyLinkedList.insertedAndDeleteElements.LinkedList;

public class Operations {
    ListNode head1;
    ListNode head2;

//    Merging two linked with sorted without using recursion
    public ListNode mergeTwoLinkedListWithoutRecursion(ListNode head1, ListNode head2){
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head1 != null){
            curr.next = head1;
        }else if(head2 != null){
            curr.next = head2;
        }
        return head ;
    }

//    Display LinkedList
    public void display(ListNode head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

//    Sorting and merging two linked list by using linked list
    public ListNode mergeTwoLinkedList(ListNode head1, ListNode head2){
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        ListNode head = new ListNode(0);

        if(head1.val <= head2.val){
            head = head1;
            head.next = mergeTwoLinkedList(head1.next, head2);
        }else{
            head = head2;
            head.next = mergeTwoLinkedList(head1, head2.next);
        }
        return head;
    }

    public ListNode getHead1(){
        return head1;
    }

    public ListNode getHead2(){
        return head2;
    }


//    Insert a element
    public void insert1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);

        head1 = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

//    Insert an element in second linked list
    public void insert2() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(6);
        ListNode n4 = new ListNode(9);

        head2 = n1;
        n1.next = n2;
        n2.next = n4;
    }
}
