package unrolledLinkedList;

import singlyLinkedList.ListNode;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;

public class UnrolledLinkedList<E> extends AbstractList<E> implements List<E>, Serializable {

//    THe maximum number of elements that can be store in single node
    private int nodeCapacity;

//    The current size of this list
    private int size = 0;

//   The first node of the list
    private ListNode firstNode;

//    The last node of the list
    private  ListNode lastNode;

//    Constructor an empty list with the specified capacity
    public UnrolledLinkedList(int nodeCapacity) throws IllegalArgumentException {
        if(nodeCapacity < 8){
            throw new IllegalArgumentException("nodeCapacity < 8");
        }

        this.nodeCapacity = nodeCapacity;
        firstNode = new ListNode();
        lastNode = firstNode;
    }

    public UnrolledLinkedList(){
        this(16);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

//    Return true if this list contains the specified element
    public boolean contains(Object o){
        return (indexOf(o) != -1);
    }


}
