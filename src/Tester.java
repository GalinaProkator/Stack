public class Tester {

    public static void main(String[] args) throws Stack.NoElementToRetrieveException {
        Stack stack = new Stack();

        //creating new not linked nodes
        int userNum1 = 15;
        int userNum2 = 16;
        int userNum3 = 22;


        //creating a queue with earlier created nodes
        stack.add(userNum1);
        stack.add(userNum2);
        stack.add(userNum3);

        //dequeue the queue
        System.out.println("The next in line is " + stack.retrieve());

//        check the size or if the queue is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack has " + stack.size() + " members");
        }

        stack.printStack();


    }
}
