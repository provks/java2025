package Java.BST1;

public class SearchNodeInBST {

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

	// Search node in BST
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		// Base case: root is null
		if (root == null) {
			return false;
		}

		// If current node matches k
		if (root.data == k) {
			return true;
		}

		// If k is less, search in left subtree
		if (k < root.data) {
			return searchInBST(root.left, k);
		}

		// If k is greater, search in right subtree
		return searchInBST(root.right, k);
	}

	
    
    public static void main(String[] args) {
        int in[] = {1,2,3,4,5,6,7};
		int pre[] = {4,2,1,3,6,5,7};
		BinaryTreeNode<Integer> root = buildTree(pre, in);
		printBinaryTreeDetailed(root);
		// search node in binary tree
		boolean isNodePresnset = searchInBST(root, 5);
		System.out.println(isNodePresnset);

    }
    
}
