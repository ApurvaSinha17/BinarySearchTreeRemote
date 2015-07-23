package problems;

import printValues.InOrderPrint;
import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class TrimBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		int k1 = 50;
		int k2 = 145;
		checkNode(rootNode,k1,k2);
		
		//In order print
		InOrderPrint.display(rootNode);
	}
	
	private static void checkNode(BinarySearchTreeNode rootNode, int k1, int k2){
		
		if(k1 < k2)
			trimTree(rootNode,k1,k2);
		else
			trimTree(rootNode,k2,k1);
	}

	private static BinarySearchTreeNode trimTree(BinarySearchTreeNode node, int small, int large){
		
		if(node == null)
			return null;
		
		node.setLeftNode(trimTree(node.getLeftNode(),small,large));
		node.setRightNode(trimTree(node.getRightNode(),small,large));
		
		if(node.getData() < small)
			return node.getRightNode();
		else if(node.getData() > large)
			return node.getLeftNode();
		else
			return node;
	}
}
