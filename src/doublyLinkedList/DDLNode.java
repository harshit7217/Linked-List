package doublyLinkedList;

public class DDLNode {
    public int data;
    public DDLNode next;
    public DDLNode prev;

    public DDLNode(int data){
        this.data = data;
        next = null;
        prev = null;
    }

    public DDLNode(int data, DDLNode prev, DDLNode next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public DDLNode getNext(){
        return this.next;
    }

    public DDLNode getPrev(){
        return this.prev;
    }

    public void setNext(DDLNode next){
        this.next = next;
    }

    public void setPrev(DDLNode prev) {
        this.prev = prev;
    }
}
