package Java.BinaryTree;

import java.util.Scanner;

public class BinaryTreeNodeUse {

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

    // public static void printBinaryTree(BinaryTreeNode<Integer> root) {
    //     // base case
    //     if (root == null) {
    //         return;
    //     }
    //     //print the root's data
    //     System.out.println(root.data);

    //     // call recursion on left sub tree, by passing left sub-tree's root node
    //     // if (root.left != null) {
    //         printBinaryTree(root.left);
    //     // }
    //     // call recursion on right sub tree, by passing right sub-tree's root node
    //     // if (root.right != null) {
    //         printBinaryTree(root.right);
    //     // }
    // }

    // taking input
    // public static BinaryTreeNode<Integer> takeInput() {
    //     // step 1: taking input from user
    //     System.out.print("Enter root data");
    //     Scanner sc = new Scanner(System.in);
    //     int rootData = sc.nextInt();

    //     // base case
    //     if (rootData == -1) {
    //         return null;
    //     }

    //     // step2: create binary tree node from rootData
    //     BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

    //     // call recursion
    //     // left subtree
    //      BinaryTreeNode<Integer> rootLeft = takeInput();
    //     // right subtree
    //      BinaryTreeNode<Integer> rootRight = takeInput();

    //     // make connections
    //     root.left = rootLeft;
    //     root.right = rootRight;

    //     return root;
    // }

    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        // step 1: taking input from user
        if (isRoot) {
            System.out.print("Enter root data: ");
        } else {
            // left of root
            if (isLeft) {
                System.out.println("Enter left child of " + parentData + ": ");
            } else {
                // right of root
                System.out.println("Enter right child of " + parentData + ": ");

            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        // base case
        if (rootData == -1) {
            return null;
        }

        // step2: create binary tree node from rootData
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        // call recursion
        // left subtree
            BinaryTreeNode<Integer> rootLeft = takeInputBetter(false, rootData, true);
        // right subtree
            BinaryTreeNode<Integer> rootRight = takeInputBetter(false, rootData, false);

        // make connections
        root.left = rootLeft;
        root.right = rootRight;

        return root;
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

    public static void main(String[] args) {
        // first node, root
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // // children of root
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);

        // // make connections
        // root.left = rootLeft;
        // root.right = rootRight;

        // // printBinaryTree(root);

        // // children of rootLeft
        // BinaryTreeNode<Integer> four = new BinaryTreeNode<>(4);
        // rootLeft.right = four;
        // // children of rootRight
        // BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5);
        // rootRight.left = five;

        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, true);

        printBinaryTreeDetailed(root);
        int numOfNodes = countNumberOfNodes(root);
        System.out.println("Number of Nodes: " + numOfNodes);

    }
    
}
