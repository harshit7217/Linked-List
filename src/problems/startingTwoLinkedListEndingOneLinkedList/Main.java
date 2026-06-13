package problems.startingTwoLinkedListEndingOneLinkedList;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();

        operations.insert();
        operations.display();
        System.out.println();
//        Finding the merging point in the linked
//        List mergingNode = operations.mergingNode();
//        System.out.println("Merging node " + mergingNode.data);

//        Finding the merge Node by using HashMap
//        List mergingNode = operations.mergingNode();
//        System.out.println("Merging node "+ mergingNode.data);

//        Finding the merge Node by Using stack
        List mergingNode = operations.mergingNodeByUsingStack();
        System.out.println("Merging node "+ mergingNode.data);
    }
}
