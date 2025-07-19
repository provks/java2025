package Java.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

    // pre order print Tree
    public static void printTree(TreeNode<Integer> root) {
        // edge/special case: if tree is empty (NOT BASE CASE)
        if (root == null) return;

        // print root data
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            // get node on index i
            TreeNode<Integer> child = root.children.get(i);
            // call recursion on child
            printTree(child);
        }
    }

    public static void printTreeBetter(TreeNode<Integer> root) {
        // edge/special case: if tree is empty (NOT BASE CASE)
        if (root == null) return;

        // print root data
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            System.out.print(child.data + " ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            // get node on index i
            TreeNode<Integer> child = root.children.get(i);
            // call recursion on child
            printTreeBetter(child);
        }
    }

    // #################### TREES PART-2 ####################
    // count no. of nodes in tree
    public static int numberOfNodes(TreeNode<Integer> root) {
        // edge/special case
         if (root == null)  return 0;

        int count = 1;
        // call recursion on each child
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            int childCount = numberOfNodes(child);
            count += childCount;
        }
        return count;
    }

    // sum of nodes in tree
    public static int sumOfNodes(TreeNode<Integer> root) {
        // edge/special case
        if (root == null)  return 0;

        int sum = root.data;
        // call recursion on each child
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            int childSum = sumOfNodes(child);
            sum += childSum;
        }
        return sum;
    }

    // ************ TAKE INPUT from user (Depth first) ************
    public static TreeNode<Integer> takeInput() {
        // take root data from user
        // create root node
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int data = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(data);

        // ask number of children for root node
        System.out.println("Enter the number of children for " + data);
        int numOfChildren = sc.nextInt();

        // call recursion on each child
        for (int i = 0; i < numOfChildren; i++) {
            TreeNode<Integer> child = takeInput();
            // make connection
            root.children.add(child);
        }

        return root;
    }


    // ************ TAKE INPUT from user (Level Wise) ************
      public static TreeNode<Integer> takeInputLevelWise() {
        // create a queue
        Queue<TreeNode<Integer>> pendingNodesQueue = new LinkedList<>();
        // take input data for root
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data:");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        // create root node
         TreeNode<Integer> root = new TreeNode<Integer>(data);
        // add node to the queue
        pendingNodesQueue.add(root);

        // create nodes for the root
        while(!pendingNodesQueue.isEmpty()) {
            // get the front node out of queue
            TreeNode<Integer> frontNode = pendingNodesQueue.poll();
            //ask for its children count
            System.out.println("Enter the no. of children for " + frontNode.data);
            int childNodesCount = sc.nextInt();
            // loop and keep adding child nodes to the queque
            for (int i = 0; i < childNodesCount; i++) {
                // get data for child node
                System.out.println("Enter the " + (i+1) + " child's data for node " + frontNode.data);
                int childData = sc.nextInt();
                // create node and insert into queue
                TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
                frontNode.children.add(childNode);
                pendingNodesQueue.add(childNode);
            }
        }
        return root;
      }



    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<Integer>(4);
        // TreeNode<Integer> node1 = new TreeNode<Integer>(1);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node3 = new TreeNode<Integer>(3);
        // TreeNode<Integer> node5 = new TreeNode<Integer>(5);
        // TreeNode<Integer> node6 = new TreeNode<Integer>(6);

        // root.children.add(node3);
        // root.children.add(node2);
        // root.children.add(node1);

        // node2.children.add(node6);
        // node2.children.add(node5);

        // print tree
        // printTree(root);
        // printTreeBetter(root);

        // System.out.println("Total nodes are: " + numberOfNodes(root));
        // System.out.println("Sum of nodes are: " + sumOfNodes(root));

        // taking user input for tree
        // TreeNode<Integer> inputRoot = takeInput();
        TreeNode<Integer> inputRoot = takeInputLevelWise();
        printTreeBetter(inputRoot);
    }
}
