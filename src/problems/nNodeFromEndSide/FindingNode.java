package problems.nNodeFromEndSide;

import java.util.Scanner;

public class FindingNode {
    Node head;

    public int findingNthNodeFromEndSide(int pos){
        int length = size();

        int mainPos = length - pos ;
        Node temp = head;
        if(mainPos < length){
            for(int i=0; i<mainPos; i++){
                temp = temp.next;
            }
        }

        return temp.data;
    }

    public int size(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    public void insert(){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        insertData(data);
    }

    public void insertData(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = null;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
