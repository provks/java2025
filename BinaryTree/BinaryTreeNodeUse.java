package Java.BinaryTree;

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

    public static void main(String[] args) {
        // first node, root
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // children of root
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);

        // make connections
        root.left = rootLeft;
        root.right = rootRight;

        // printBinaryTree(root);

        // children of rootLeft
        BinaryTreeNode<Integer> four = new BinaryTreeNode<>(4);
        rootLeft.right = four;
        // children of rootRight
        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5);
        rootRight.left = five;

        printBinaryTreeDetailed(root);

    }
    
}
