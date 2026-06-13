package problems.findMiddleOfLinkedList;

public class Main {
    public static void main(String[] args) {
        Operations operations = new   Operations();
        operations.insert();

//        Finding the middle node of the list
        List middleNode = operations.middleNode();
        System.out.println(middleNode.data);

//        Finding the middle node of the list by using map
        middleNode = operations.middleNodeUsingHashMap();
        System.out.println(middleNode.data);

//        Finding the middle node of the list by using scan at once
        middleNode = operations.middleNodeUsingSingleScan();
        System.out.println(middleNode.data);

//        Reverse traversing of the linked list
        operations.reverseTraverse();

//        Checking the length of the list
        System.out.println(operations.lengthEvenOrOdd());
    }
}
