package problems.nullTerminatesAndEndInACycle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Operations {
    List head;

//    Insert a node in sorted list
    public void insertListInSortedList(List current){
        List temp = head, prev = head;
        while(temp != null && temp.data < current.data){
            prev = temp;
            temp = temp.next;
        }
        current.next = temp;
        prev.next = current;
        display();
    }

    public void display(){
        List current = head;
        while(current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    }

//    Finding the length of the loop
    public int lengthOfLoop(){
        List fast = head;
        List slow = head;
        boolean isExisted = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow.equals(fast)){
                isExisted = true;
                break;
            }
        }
        int length = 0;
        if(isExisted){
            do{
                slow = slow.next;
                length++;
            }while(slow != fast);
        }
        return length;
    }

//    Finding a loop with the increment of 2 and 3 steps
    public boolean isCyclicInTwoThreeSteps(){
        List fast = head;
        List slow = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next.next;
            slow = slow.next.next;
            if(slow.equals(fast)){
                return true;
            }
        }
        return false;
    }

//    Check weather a loop in a linked list and return a node of the starting of the loop
    public List startingLoop(){
        List fast = head;
        List slow = head;
        boolean isExisted = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow.equals(fast)){
                isExisted = true;
                break;
            }
        }

        if(isExisted){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }else{
            return null;
        }
    }

//    Checking by using it is snake or snail a linked list
    public String isSnakeOrSnail(){
        List slow = head;
        List fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow.equals(fast)){
                return "Snail";
            }
        }
        return "Snake";
    }

//    Using Floyd cycle
    public boolean isCyclicUsingFloydCyclic(){
        List slow = head;
        List fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast.equals(slow)){
                return true;
            }
        }
        return false;
    }

//    Using Sorting Technique
    public boolean isCyclicUsingSorting(){
        List[] arr = new List[size];
        List temp = head;
        for(int i=0; i<size; i++){
            arr[i] = temp.next;
            temp = temp.next;
        }

        Arrays.sort(arr, Comparator.comparingInt(System::identityHashCode));

        for(int i=0; i<size-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

//    Using Hash Table
    public boolean isCyclicUsingHashTable(){

        HashSet<List> set = new HashSet<>();
        List temp = head;

        while(temp != null){
            if(set.contains(temp)){
                return true;
            }else{
                set.add(temp);
            }
            temp = temp.next;
        }

        return false;
    }


//    Brute force approach
    int size = 8;
    public boolean isCyclicInBruteForce(){
        List temp = head;
        int counter = 0;
        while(temp != null){
            List second = temp.next;
            counter++;
            for(int i=counter; i<size; i++){
                if(temp.equals(second)) return true;
                second = second.next;
            }
            temp = temp.next;
        }
        return false;
    }

    public void creatingLinkedList(){
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
