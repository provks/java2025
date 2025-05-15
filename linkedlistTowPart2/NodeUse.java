package Java.linkedlistTowPart2;

import java.util.Scanner;

public class NodeUse {

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

    //  Print LL recursively
    public static void printRec(Node<Integer> head) {
        // base case
        if (head == null) {
            return;
        }

        // small calc.
        System.out.print(head.data + " ");

        // recursive call
        printRec(head.next);

        // small calc.
        // System.out.print(head.data + " ");
    }

    // Reverse LL (Iterative)
    public static Node<Integer> reverseLL(Node<Integer> head){
        // initialize prev, curr, and next
        Node<Integer> prev = null, curr = head, next;

        // traverse over LL
        while (curr != null) {
            // keep "next node" safe
            next = curr.next;

            // making the connect with prev
            curr.next = prev;

            // update prev and curr
            prev = curr;
            curr = next;
        }
        // return new head (previously tail)
        return prev;
    }

    // reversed LL (Recursive)
    public static Node<Integer> reverseLLRec(Node<Integer> head){
       // base case
       if (head == null || head.next == null) {
            return head;
       }

       // call recursion
       Node<Integer> reversedHead = reverseLLRec(head.next);
       // traverse till tail and connect tail.next with head
    //    Node<Integer> tail = reversedHead;
    //    while (tail.next != null) {
    //         tail = tail.next;
    //    }
        head.next.next = head;
       // make connection of tail with head
    //    tail.next = head;
       head.next = null;
       return reversedHead;
    }

    // returns mid of LL
    public static Node<Integer> midLL(Node<Integer> head) {
        // initialize 2 pointers, slow and fast, has ref of head
        Node<Integer> slow = head, fast = head;

        // till we meet the breakpoint, keep on updating fast by 2 and slow by 1
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Node<Integer> head = createLL();
        Node<Integer> head = takeInput();
        printRec(head);
        // Node<Integer> reversedHead = reverseLLRec(head);
        Node<Integer> mid = midLL(head);
        System.out.println();
        System.out.println(mid.data);
        // printRec(mid);


    }
}
