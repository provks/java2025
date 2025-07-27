package Java.priorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
    // arraylist
    private ArrayList<Element<T>> heap;

    // constructor
    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    // insert
    public void insert(T value, int priority) {
        // create an element to store the new element
        Element<T> e = new Element<>(value, priority);
        // add element to heap
        heap.add(e);


        // childIndex, parentIndex
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        
        while (childIndex > 0) {
            // compare and swap
            Element<T> child = heap.get(childIndex);
            Element<T> parent = heap.get(parentIndex);
            if (child.priority < parent.priority) {
                heap.set(childIndex, parent);
                heap.set(parentIndex, child);
                // update indexes
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            } else {
                return;
            }
        }

    }

    // get min
    public T getMin() throws EmptyPriorityQueueException {
        // check if heap is empty
        if (isEmpty()) {
            throw new EmptyPriorityQueueException();
        }
        return heap.get(0).value;
    }

    // remove min
    public T removeMin() throws EmptyPriorityQueueException {
        // edge case: pq is empty, i.e. array is empty
        if (isEmpty()) {
            throw new EmptyPriorityQueueException();
        }
        // store min in temp
        Element<T> removedeElement = heap.get(0);
        T value = removedeElement.value;


        // move last element to top(0th index)
        heap.set(0, heap.get(heap.size()-1));
        // remove last element
        heap.remove(heap.size()-1);

        //parentIndex, leftChildIndex, rightChildIndex
        int parentIndex = 0;
        int leftChildIndex = (2*parentIndex+1);
        int rightChildIndex = (2*parentIndex+2);

        while (leftChildIndex < heap.size()) {
            // compare and swap with smaller child, and then update indices
            int minIndex = parentIndex;

            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }

            // check if rightChildIndex exists
            if (rightChildIndex < heap.size() &&  (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
                minIndex = rightChildIndex;
            }

            // edge case, no need to swap, parent is min among its children
            if( minIndex == parentIndex) {
                break;
            }
            // swap
            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = (2*parentIndex+1);
            rightChildIndex = (2*parentIndex+2);
        }
        return value;
    }

    // size
    public int size() {
        return heap.size();
    }

    // isEmpty
    public boolean isEmpty() {
        return (heap.size() == 0);
    }
}