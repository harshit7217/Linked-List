package problems.nNodeFromEndSide;

public class Main {
    public static void main(String[] args) {
        FindingNode node = new FindingNode();
        node.insert();
        node.insert();
        node.insert();
        node.insert();
        node.insert();
        node.insert();

        System.out.println("Find the nth node from end side "+node.findingNthNodeFromEndSide(3));

        System.out.println("Optimize method "+ node.optimizeNthNodeFromEndSide(3));
    }
}
