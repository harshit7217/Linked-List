package problems.findMiddleOfLinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class Operations {
    List head;

//    checking the length of list is even or odd
    public boolean lengthEvenOrOdd(){
        List temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next.next;
        }
        return temp == null ? true : false;
    }

//    traverse a linked list in back
    public void reverseTraverse(){
        List current = head;
        traverse(current);
    }

    private void traverse(List current){
        if(current == null) return;

        traverse(current.next);
        System.out.print(current.data+" ");
    }

//    Using single scan
    public List middleNodeUsingSingleScan(){
        List first = head;
        List second = head;
        boolean check = true;
        while(first.next != null){
            if(check){
                first = first.next;
                check = false;
            }else if(!check){
                first = first.next;
                second = second.next;
                check = true;
            }
        }
        return second;
    }

//    Using hashMap
    public List middleNodeUsingHashMap(){
        int length = 0;
        List temp = head;
        HashMap<Integer, List> map = new HashMap<>();

        while(temp != null){
            length++;
            map.put(length, temp);
            temp = temp.next;
        }

        return map.get(length/2);
    }

//    Finding the middle node of the list
    public List middleNode(){
        int length = 0;
        List temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int mid = length / 2;
        temp = head;

        for(int i=1; i<mid; i++){
            temp = temp.next;
        }
        return temp;
    }

//    Insert a element
    public void insert(){
        List newList = new List(1);
        head = newList;
        List newList2 = new List(2);
        List newList3 = new List(3);
        List newList4 = new List(4);
        List newList5 = new List(6);
        List newList6 = new List(7);
        List newList7 = new List(8);
        List newList8 = new List(9);
        newList.next = newList2;
        newList2.next = newList3;
        newList3.next = newList4;
        newList4.next = newList5;
        newList5.next = newList6;
        newList6.next = newList7;
        newList7.next = newList8;
//        newList8.next = newList3;
        newList8.next = null;
    }
}
