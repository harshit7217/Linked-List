package problems.nNodeFromEndSide;

import java.util.HashMap;
import java.util.Scanner;

public class FindingNode {
    Node head;
    private int counter = 0;
    Node endNode;

//    Using a recursion by single scan
    public int usingRecursionToFindNthNodeFromEndSide(int pos){
        Node temp = usingRecursion(head, pos);
        return endNode.data;
    }

    private Node usingRecursion(Node temp, int pos){
        if(temp != null){
            usingRecursion(temp.next, pos);
            counter ++;
            if(pos == counter){
                endNode = temp;
            }
        }
        return null;
    }

//    Using single scan and without HashMap
    public int usingSingleScanToFindNthNodeFromEndSide(int pos){
        Node temp = head, node = null;

        for(int i=1; i<pos; i++){
            if(temp != null){
                temp = temp.next;
            }
        }

        while(temp != null){
            if(node == null){
                node = head;
            }else {
                node = node.next;
            }
            temp = temp.next;
        }

        return node.data;
    }

//    Using HashMap
    public int optimizeNthNodeFromEndSide(int pos){
        Node temp = head;
        HashMap<Integer, Node> map = new HashMap<>();
        int length = 0;

        while(temp != null){
            length++;
            map.put(length, temp);
            temp = temp.next;
        }

        if(pos > length - 1){
            System.out.println("Fewer number of nodes");
            return -1;
        }

        int mainPos = length - pos + 1;

        Node result = map.get(mainPos);
        return result.data;
    }

//    Brute Force
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
