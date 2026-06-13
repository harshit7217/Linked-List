package problems.startingTwoLinkedListEndingOneLinkedList;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Operations {
    List head1, head2;

//    Finding the merging point in two linked list
//    By using stack
    public List mergingNodeByUsingStack(){
        List temp = head1;
        Stack<List> stack1 = new Stack<>();
        Stack<List> stack2 = new Stack<>();

        while(temp != null){
            stack1.push(temp);
            temp = temp.next;
        }

        temp = head2;

        while(temp != null){
            stack2.push(temp);
            temp = temp.next;
        }
        List node = null;
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek().equals(stack2.peek())){
                node = stack2.pop();
                stack1.pop();
            }else {
                break;
            }
        }
        return node;
    }

//    Finding the merging point in two linked list
//    By using hashMap
    public List mergingNodeByUsingHashMap(){
        List temp = head1;
        HashSet<List> set = new HashSet<>();

        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }

        temp = head2;
        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }
        return null;
    }

//    Finding the merging point in two linked list
//    By using brute force
    public List mergingNode(){
        List current = head1;
        while(current != null){
            List temp = head2;
            while(temp != null){
                if(temp.equals(current)){
                    return temp;
                }
                temp = temp.next;
            }
            current = current.next;
        }
        return null;
    }

    public void display(){
        List temp = head1;
        System.out.println("First Linked List");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

//        Other list traverse
        System.out.println("Second Linked List");
        temp = head2;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

//    inserting an element
    public void insert(){
        List node = new List(1);
        List node2 = new List(2);
        List node3 = new List(3);
        List node4 = new List(4);
        List node5 = new List(5);
        List node6 = new List(6);
        List node7 = new List(7);
        List node8 = new List(8);
        head1 = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

//        other linked list

        List node9 = new List(9);
        List node10 = new List(10);
        List node11 = new List(11);
        head2 = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node5;
    }
}
