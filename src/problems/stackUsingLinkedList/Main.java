package problems.stackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        StackOperations stackOperations = new StackOperations();

        stackOperations.push();
        stackOperations.push();
        stackOperations.push();
        stackOperations.push();

        stackOperations.pop();

        System.out.println("Size "+stackOperations.size());
        System.out.println("TOP "+ stackOperations.top());

        stackOperations.display();
    }
}
