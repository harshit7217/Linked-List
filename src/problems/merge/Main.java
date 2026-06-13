package problems.merge;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();

//        Inserting an element
        operations.insert1();
        operations.insert2();

//        Merging the two linked list and sorted way
        ListNode head1 = operations.getHead1();
        ListNode head2 = operations.getHead2();


//        System.out.println("With Recursion");
//        ListNode head = operations.mergeTwoLinkedList(head1, head2);
//        operations.display(head);
//        System.out.println();

//        List 1
        operations.display(head1);
        System.out.println();

//        List 2
        operations.display(head2);
        System.out.println();

//        Without using recursion
        System.out.println("Without recursion: ");
        ListNode head = operations.mergeTwoLinkedListWithoutRecursion(head1, head2);
        operations.display(head);
    }
}
