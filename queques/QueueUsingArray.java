package Java.queques;

public class QueueUsingArray {
    private int data[];
    private int front;  // index of element at the front of the queue
    private int rear;   // index of element at the rear of the queue
    private int size;   // total number of elements in the queue

    // constructor
    QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        // size = 0;
    }
    
    QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    // size
    public int size() {
        return size;
    }

    // queue is empty or not
    public boolean isEmpty() {
        return (size == 0);
    }

    // enqueue
    public void enqueque(int element) {
        // handle queue is full
        if (size == data.length) {
            // throw new QueueFullException();
            // create double sized array
            System.out.println("Creating array of double capacity");
            doubleCapacity();
        }
        // if inserting first element, update front
        if (size == 0) {
            front = 0;
        }
        // rear++;
        // // handle case, when front removed, and inserting new element
        // if (rear == data.length) {
        //     rear = 0;
        // }
        rear = (rear+1) % data.length; // set range from 0 to data.length-1
        data[rear] = element;
        // update size of queue
        size++;
    }

    private void doubleCapacity() {
        // create double sized array
        int temp[] = data;
        data = new int[2 * data.length];

        // copy elements
        int index = 0;
        // copy elements from front to length-1
        for(int i = front; i <= temp.length-1; i++) {
            data[index] = temp[i];
            index++;
        }
        // copy element from 0 to front-1
        for(int i = 0; i < front-1; i++) {
            data[index] = temp[i];
            index++;
        }
        // update front and rear for the new array
        front = 0;
        rear = temp.length-1;
    }

    //front
    public int front() throws QueueEmptyException {
        // handle queue is empty
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    // dequeue
    public int dequeue() throws QueueEmptyException {
        // handle dequeue, empty queue
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        // front++;
        // // handle case with front is going out of bound
        // if (front == data.length) {
        //     front = 0;
        // }
        front = (front+1) % data.length; // set range from 0 to data.length-1
        size--;
        return temp;
    }

    
}
