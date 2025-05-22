package Java.Stack;

public class Node<T> {
    T data;
    Node next;

    // Node() {

    // }

    // constructor
    Node(T data) {
        this.data = data;
        this.next = null;   // null by default
    }

    public static void main(String[] args) {
        
        Node<Integer> n1 = new Node<>(10);
        
        Node<Integer> n2;
        n2 = new Node<>(20);
    }
}
