package Java.queques.QueueWithLL;

import Java.queques.QueueEmptyException;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    // size
    public int size() {
        return size;
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // enqueque
    public void enqueque(T elem) {
        // create node
        Node<T> newNode = new Node<>(elem);
        // handle case: inserting first element into queque
        if (size == 0) { // or rear == null
            //update front and rear both
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        // update size
        size++;
    }

    // front
    public T front() throws QueueEmptyException {
        if (size == 0) {
            // queque is empty
            throw new QueueEmptyException();
        }
        return front.data;
    }

    // dequeue
    public T dequeue() throws QueueEmptyException {
        // queue is empty
        if (size == 0) {
            // queque is empty
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        // handle case: deleting last element from queque
        if (front == null) {
            // update rear to null
            rear = null;
        }
        // update size
        size--;
        return temp;
    }


}
