package Java.BST2;

import java.util.ArrayList;
import java.util.Scanner;

public class BST2 {

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

	// take tree input
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of"+ parentData);
            }
        }
        // System.out.println("Enter root data");
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
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

	public static ArrayList<Integer> findPathToNodeKInBinaryTree(BinaryTreeNode<Integer> root, int data) {
		// base case
		if (root == null) {
			return null;
		}

		// check if root = data
		if (root.data == data) {
			// create arraylist, insert root.data into it, and return arraylist
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}

		// call recursion
		// left subtree
		ArrayList<Integer> leftOutput = findPathToNodeKInBinaryTree(root.left, data);
		if (leftOutput != null) {
			// adding root to the arraylist
			leftOutput.add(root.data);
			return leftOutput;
		}

		// recursion call on right subtree
		ArrayList<Integer> rightOutput = findPathToNodeKInBinaryTree(root.right, data);
		if (rightOutput != null) {
			// adding root to the arraylist
			rightOutput.add(root.data);
			return rightOutput;
		}

		return null;
	}
    
    public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, false);
		printBinaryTreeDetailed(root);
		// search node in binary tree
		// boolean isNodePresnset = searchInBST(root, 5);
		// System.out.println(isNodePresnset);

		// find path from node to root
		System.out.println("root.data" + root.data);
		ArrayList<Integer> path = findPathToNodeKInBinaryTree(root, 6);
		if (path == null) {
			System.out.println("Node found!");
		} else {
			for (int i : path) {
				System.out.println(i);
			}
		}

    }
    
}
