package Java.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree2NodeUse {

    public static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root) {
        // base case
        if (root == null) {
            return;
        }
        //print the root's data
        System.out.print(root.data + ":");

        // call recursion on left sub tree, by passing left sub-tree's root node
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        // call recursion on right sub tree, by passing right sub-tree's root node
        if (root.right != null) {
            System.out.print("R" + root.right.data );
        }
        System.out.println();
        printBinaryTreeDetailed(root.left);
        printBinaryTreeDetailed(root.right);
    }

    // count number of nodes in a binary tree
    public static int countNumberOfNodes(BinaryTreeNode<Integer> root) {
        // base case: root is null
        if (root == null) {
            return 0;
        }

        // recursive call
        int leftSubtreeNodeCount = countNumberOfNodes(root.left);
        int rightSubtreeNodeCount = countNumberOfNodes(root.right);

        // small calc
        return leftSubtreeNodeCount + rightSubtreeNodeCount + 1;
    }

    // take input level wise
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        // take input
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        // handle empty binary tree
        if (rootData == -1) return null;

        // insert it(root) into queue
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()) {
            // take out front from queue
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            
            System.out.println("Enter the left of " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                // attach to the left of front
                 BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                 front.left = leftChild;
                // insert leftChile into queque
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter the right of " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                // attach to the right of front
                 BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                 front.right = rightChild;
                // insert rightChild into queque
                pendingChildren.add(rightChild);
            }

        }
        return root;
    }


    public static int numOfLeaves(BinaryTreeNode<Integer> root) {
        // base case
        if (root == null) return 0;

        // check if root is leaf node
        if (root.left == null && root.right == null) return 1;

        // recursive call
        // return numOfLeaves(root.left) + numOfLeaves(root.right);
        int numOfLeavesRightSubtree = numOfLeaves(root.right);
        int numOfLeavesLeftSubtree = numOfLeaves(root.left);
        return numOfLeavesLeftSubtree + numOfLeavesRightSubtree;

    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int K) {
        // base case
        if (root == null) return;

        // K = 0
        if (K == 0) {
            System.out.println(root.data);
            return;
        }

        // k > 0
        //call recursion
        printAtDepthK(root.left, K-1);
        printAtDepthK(root.right, K-1);
    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        // base case
        if(root == null) return;

        // swap children (left node with right node)
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        // call recursion
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();

        printBinaryTreeDetailed(root);
        int numOfNodes = countNumberOfNodes(root);
        System.out.println("Number of Nodes: " + numOfNodes);
        System.out.println("Number of Leaf Nodes: " + numOfLeaves(root));
        printAtDepthK(root, 2);
        mirrorBinaryTree(root);
        printBinaryTreeDetailed(root);

    }
    
}
