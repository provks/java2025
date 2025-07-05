package Java.BinaryTree;

public class BuildBinaryTreeFromPreIn {

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

    public static  BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] preOrder, int[] inOrder, int siPre, int eiPre, int siIn, int eiIn) {
		// base case
		if (siPre > eiPre) {
			// handles: if pre-order is empty, that means my in-order is also empty
			return null;
		}

		// STEP-1: find the root node
		// root node is the first element (start index) in the preOrder
		int rootData = preOrder[siPre];
		// create root node
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		// STEP-2: finding indices
		// find root index within in-order
		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (inOrder[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		// left subtree
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eiInLeft = rootIndex-1;
		// right subtree
		int siInRight = rootIndex+1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		// find length of left sub tree
		int leftSubtreeLength = eiInLeft - siInLeft + 1;
		int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		// STEP-3: Using recursion to build left and right subtree
		// build left subtree
		BinaryTreeNode<Integer> leftRoot = buildTreeFromPreInHelper(preOrder, inOrder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> rightRoot = buildTreeFromPreInHelper(preOrder, inOrder, siPreRight, eiPreRight, siInRight, eiInRight);

		// STEP-4: Connect leftRoot and rightRoot with root, return root
		root.left = leftRoot;
		root.right = rightRoot;
		return root;
	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
		return root;
	}
    
    public static void main(String[] args) {
        int in[] = {4,2,5,1,6,3};
		int pre[] = {1,2,4,5,3,6};
		BinaryTreeNode<Integer> root = buildTree(pre, in);
		printBinaryTreeDetailed(root);

    }
    
}
