package problems.nullTerminatesAndEndInACycle;

public class Main {
    public static void main(String[] args) {
//        Creating a dummy linked list
        Operations operations = new Operations();
        operations.creatingLinkedList();

//       Checking if there is any cyclic in linked list
//        System.out.println(operations.isCyclicInBruteForce());

//        Checking if there is any cyclic in linked list by using Hash Set
//        System.out.println(operations.isCyclicUsingHashTable());

//        Checking if there is any cyclic in linked list by sorting technique
//        System.out.println(operations.isCyclicUsingSorting());

//        Checking by using a Floyd cycle
//        System.out.println(operations.isCyclicUsingFloydCyclic());

//        Checking a snake or snail
//        System.out.println(operations.isSnakeOrSnail());

//        Finding a starting point of the loop
//        List temp = operations.startingLoop();
//        System.out.println(temp.data);

//        Finding a loop by using 2 and 3 steps
//        System.out.println(operations.isCyclicInTwoThreeSteps());

//        Finding the length of the cyclic
//        System.out.println(operations.lengthOfLoop());

//        Insert a node in sorted list
        List current = new List(5);
        operations.insertListInSortedList(current);
    }
}
