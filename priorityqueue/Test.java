package Java.priorityqueue;

public class Test {
    public static void main(String[] args) throws EmptyPriorityQueueException {
        Priority_Queue<String> pq = new Priority_Queue<>();

        pq.insert("abc", 12);
        pq.insert("bcd", 25);
        pq.insert("def", 15);
        pq.insert("fgh", 10);

        while (!pq.isEmpty()) {
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }
}
