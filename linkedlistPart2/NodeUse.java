package Java.linkedlistPart2;

public class NodeUse {

    // create linked list, returns head
    public static Node<Integer> createLL(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        // make connection
        n1.next = n2;
        n2.next = n3;

        return n1;
    }

    // printing nodes / linked list
    public static void printNodes(Node<Integer> head) {
        Node<Integer> temp = head;  // good practice
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // while(temp != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
    }
    
    public static int length(Node<Integer> head) {
        int count = 0;
        while(head != null) {
            // System.out.print(head.data + " ");
            head = head.next;
            count++;
        }
        return count;
    }

    public static void incrementData(Node<Integer> head) {
        // head.data++;
        // head.data = head.data+1;
        head.data = head.data+5;
    }


    public static void main(String[] args) {
        
        // Node<Integer> n1 = new Node<>(10);
        
        // Node<Integer> n2;
        // n2 = new Node<>(20);
        
        // Node<Integer> n3 = new Node<>(30);

        // System.out.println("n1:"+n1);
        // System.out.println("n2:"+n2 );



        // System.out.println("n1 " + "data " + n1.data + " next " + n1.next);
        // System.out.println("n2 " + "data " + n2.data + " next " + n2.next);

        // // connecting nodes
        // n1.next = n2;
        // n2.next = n3;

        // System.out.println("n1 " + "data " + n1.data + " next " + n1.next);
        // System.out.println("n2 " + "data " + n2.data + " next " + n2.next);

        // System.out.println(n1.next.data);
        // System.out.println(n1.next.next.data);

        Node<Integer> head = createLL();
        // System.out.println("head " + "data " + head.data + " next " + head.next);
        // System.out.println(head.next.data); // 2nd node's data
        // System.out.println(head.next.next.data); // 3rd node's data
        // System.out.println(head.next.next.next.data); // 4th node's data

        // call print method to print all nodes
        printNodes(head);
        System.out.println();
        // System.out.println("length:" + length(head));
        // incrementData(head);
        // System.out.println("increment:" + head.data);
        printNodes(head.next.next);

    }
}
