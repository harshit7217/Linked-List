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
//       Brute Force
        System.out.println("Find the nth node from end side "+node.findingNthNodeFromEndSide(3));

//        Optimized by using HashMap
        System.out.println("Optimize method "+ node.optimizeNthNodeFromEndSide(3));

//        Optimized using single scan
        System.out.println("Optimized by using single scan: "+ node.usingSingleScanToFindNthNodeFromEndSide(3));

//        Single scan by using a Recursion
        System.out.println("Single scan by using a Recursion: "+ node.usingRecursionToFindNthNodeFromEndSide(3));
    }
}
