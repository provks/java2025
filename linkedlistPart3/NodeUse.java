package linkedlistPart3;

import java.util.Scanner;

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

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            // create node (current node)
            Node<Integer> currentNode = new Node<>(data);
            // connection
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                // traverse till tail
                // Node<Integer> tail = head;
                // while(tail.next != null) {
                //     tail = tail.next;
                // }
                // make connection of the currentNode with tail
                tail.next = currentNode;
                // update tail
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insertNodeAtPos(Node<Integer> head, int data, int pos) {
        // create the node that needs to be inserted into LL
        Node<Integer> nodeToBeInserted = new Node<Integer>(data);
        // handle pos = 0
        if (pos == 0) {
            // connection with head
            nodeToBeInserted.next = head;
            // return new head
            // head = nodeToBeInserted;
            // return head;
            return nodeToBeInserted;
        } else {
            // traverse till pos-1
            int count = 0;
            Node<Integer> prev = head;
            while(count < pos-1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) { // handle case: pos > length of LL
                nodeToBeInserted.next = prev.next;  // first connection
                prev.next = nodeToBeInserted;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Node<Integer> head = createLL();
        Node<Integer> head = takeInput();
        head = insertNodeAtPos(head, 50, 0);
        // call print method to print all nodes
        printNodes(head);
        System.out.println();
        // printNodes(head.next.next);

    }
}
