package Java.BST2;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
        // base case
        if (node == null) {
            return;
        }
        //print the node's data
        System.out.print(node.data + ":");

        // call recursion on left sub tree, by passing left sub-tree's node node
        if (node.left != null) {
            System.out.print("L" + node.left.data + ",");
        }
        // call recursion on right sub tree, by passing right sub-tree's node node
        if (node.right != null) {
            System.out.print("R" + node.right.data );
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    // print BST
    public void print() {
        printTreeHelper(root);
    }

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
        // base case
        if (node == null) {
            return false;
        }

        // node = x
        if (node.data == x) {
            return true;
        }

        // call recursion
        if (x < node.data) {
            return isPresentHelper(node.left, x);
        } else {
            return isPresentHelper(node.right, x);
        }
    }

    // check if element is present in tree
    public boolean isPresent(int x) {
        return isPresentHelper(root, x);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {
        // base case
        if (node == null) {
            //create new node with root.data as x
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x);
            return newNode;
        }

        // compare node.data with x
        if (x > node.data) {
            node.right = insertHelper(node.right, x);
            // BinaryTreeNode<Integer> newRightNode = insertHelper(node.right, x);
            // node.right = newRightNode;
        } else {
            node.left = insertHelper(node.left, x);
        }

        return node;
    }

    // insert into tree
    public void insert(int x) {
        root = insertHelper(root, x);
    }

}
