package Java.queques;

public class QueueUse {
    public static void main(String[] args) {
        int elements[] = {10, 20, 30, 40, 50, 60, 70};
        QueueUsingArray queue = new QueueUsingArray();

        for (int i : elements) {
            queue.enqueque(i);
            // try {
            //     queue.enqueque(i);
            // } catch (QueueFullException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            //     System.out.println("Queue is full!");
            // }
        }

        // try {
        //     queue.dequeue();
        //     System.out.println("Front: " + queue.front());
        // } catch (QueueEmptyException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        while (!queue.isEmpty()) {
            // int elem;
            try {
                System.out.println(queue.dequeue());
                // elem = queue.dequeue();
                // System.out.println(elem);
            } catch (QueueEmptyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
