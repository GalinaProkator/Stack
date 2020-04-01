public class Stack {
    public static class NoElementToRetrieveException extends Exception {

        public NoElementToRetrieveException() {
            super("There is no member to retrieve");
        }
    }

    private int amountOfMembers = 0;
    private Node firstMember = null;
    private Node lastMember = null;

    public void add(int userNum) {
        Node node = new Node(userNum);

        if (amountOfMembers != 0) {
            node.setNext(firstMember);
        }
        firstMember = node;
        amountOfMembers++;
    }

    public int retrieve() throws NoElementToRetrieveException {
        if (firstMember == null) {
            throw new NoElementToRetrieveException();
        }
        int value = firstMember.getValue();
        firstMember = firstMember.getNext();

        amountOfMembers--;
        return value;
    }

    public boolean isEmpty() {
        if (firstMember == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return amountOfMembers;
    }

    private static void printStack(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        printStack(node.getNext());
    }


    public void printStack() {
        printStack(firstMember);
    }

}
