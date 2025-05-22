package Java.Stack;
import Java.Stack.Node;

public class StackwithLL<T> {
    private Node<T> head;
    private int size;

    // constructor
    StackwithLL(){
        head = null;
        size = 0;
    }

    // size
    public int size() {
        return size;
    }

    // stack is empty or not
    public boolean isEmpty() {
        return (size == 0);
    }

    // insert
    public void push(T elem) {
        // creating node
        Node<T> newNode = new Node<>(elem);
        // connect new node with head
        newNode.next = head;
        // update head
        head = newNode;
        // update size
        size++;
    }

    // pop
    public T pop() throws StackEmptyException {
        // LL is empty
        if (head == null) {
            throw new StackEmptyException();
        }
        // save the data at head
        // when we are pushing data, we are inserting at the front/beginning
        T temp = head.data;
        // update head
        head = head.next;
        // update size
        size--;
        return temp;
    }

    // peek
    public T peek() throws StackEmptyException {
        // LL is empty
        if (head == null) {
            throw new StackEmptyException();
        }
        return head.data;
    }

}
