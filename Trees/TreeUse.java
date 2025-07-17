package Java.Trees;

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

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(1);
        TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        TreeNode<Integer> node3 = new TreeNode<Integer>(3);
        TreeNode<Integer> node5 = new TreeNode<Integer>(5);
        TreeNode<Integer> node6 = new TreeNode<Integer>(6);

        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node1);

        node2.children.add(node6);
        node2.children.add(node5);

        // print tree
        // printTree(root);
        printTreeBetter(root);

    }
}
