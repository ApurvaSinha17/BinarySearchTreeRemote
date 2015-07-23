package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class KthSmallestElementBST {
	
	private static BinarySearchTreeNode kNode = null;
	private static int count = 0;
	private static int k = 0;

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		k = 5;
		getKthSmallestElement(rootNode);
		if(kNode != null)
			System.out.println("Kth node data: "+kNode.getData());
	}
	
	private static void getKthSmallestElement(BinarySearchTreeNode node){
		
		if(node == null)
			return;
		
		getKthSmallestElement(node.getLeftNode());
		count = count + 1;
		
		if(count == k)
			kNode = node;
		
		getKthSmallestElement(node.getRightNode());
		
	}

}
