package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;
import createBinaryTree.BinaryTreeCreate;

//Time complexity: O(n)
//Space complexity: O(n)
public class IsBST {

	public static void main(String[] args) {
		
		//BinarySearchTreeNode rootNode = BinaryTreeCreate.createCompleteBinaryTree();
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		
		if(isBinarySearchTree(rootNode,Integer.MIN_VALUE,Integer.MAX_VALUE))
			System.out.println("Is a binary search tree");
		else
			System.out.println("Not a binary search tree");
	}

	private static Boolean isBinarySearchTree(BinarySearchTreeNode node, int min, int max){
		
		if(node == null)
			return true;
		
		return (node.getData() > min && node.getData() < max && isBinarySearchTree(node.getLeftNode(), min, node.getData()) && isBinarySearchTree(node.getRightNode(), node.getData(), max));
	}
}
