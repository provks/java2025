package Java.Stack;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException, StackFullException {

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
        // creating new stack
        StackWithArrays stack = new StackWithArrays();
        // StackWithArrays stack = new StackWithArrays(arr.length);

        for(int val: arr) {
            stack.push(val);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());

        // // stack.data[2] = 100;

        // // insert element into stack on top
        // stack.push(10);
        // stack.push(20);
        // System.out.println(stack.size());

        // // remove top element from stack and return it.
        // stack.pop();

        // // check the element on top, and return it
        // System.out.println("Peeking: ....");
        // stack.peek();
        // System.out.println(stack.peek());

        // // check total elements in stack, return total number of elements present in stack
        // stack.size();
        // System.out.println(stack.size());

        // // check if stack is empty or not, return true/false
        // stack.isEmpty();
        // System.out.println("Element popped: " +stack.pop());
        // System.out.println("size: " + stack.size());
        // System.out.println(stack.isEmpty());
    }

}
