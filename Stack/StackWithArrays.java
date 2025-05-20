package Java.Stack;

public class StackWithArrays {
    // data
    private int data[];

    // top element index
    private int topIndex;   // index of top most element on stack

    // constructor
    StackWithArrays() {
        data = new int[1];
        topIndex = -1;
    }
    
    // parameterized constructor
    StackWithArrays(int size) {
        data = new int[size];
        topIndex = -1;
    }

    // size 
    // Time complexity: O(1)
    public int size() {
        return topIndex+1;
    }

    // check if empty
    // Time complexity: O(1)
    public boolean isEmpty() {
        // if(topIndex == -1) {
        //     return true;
        // }
        // return false;
        return (topIndex == -1);

    }

    // insert
    // Time complexity: O(n)
    public void push(int elem) throws StackFullException {
        // if stack is full/ array is full/ topIndex is 4
        if (topIndex == data.length-1) {
            // throw exception: StackFullException
            // throw new StackFullException();
            // double the capacity of the array
            doubleCapacity();
        }
        data[topIndex+1] = elem;
        topIndex++;

    }

    private void doubleCapacity() {
        System.out.println("Calling double capacity!");
        int temp[] = new int[data.length*2];
        // copy elements of data array into temp arr
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // return top element
    // Time complexity: O(1)
    public int peek() throws StackEmptyException {
        // handle stack empty case, topIndex = -1
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // remove
    // Time complexity: O(1)
    public int pop() throws StackEmptyException {
        // if stack is empty
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        // int temp = data[topIndex];
        // topIndex--;
        // return temp;
        return data[topIndex--];
    }
}
