package problems.stackUsingLinkedList;

import java.util.Scanner;

public class StackOperations {

    Node head = null;
    Node tail = null;
    int length = 0;

    public void push(){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        insertData(data);
    }

    public void insertData(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
            head.next = null;
            head.prev = null;
            length++;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
            length++;
        }
    }

    public int top(){
        if(tail == null) return -1;
        return tail.data;
    }

    public int size(){
        return length;
    }

    public void pop(){
        if(tail == null){
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        System.out.println(temp.data);
    }

    public void display(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

}
