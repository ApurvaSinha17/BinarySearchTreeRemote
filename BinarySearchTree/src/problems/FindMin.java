package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class FindMin {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		System.out.println("Min data: "+getMinNode(rootNode).getData());
	}
	
	public static BinarySearchTreeNode getMinNode(BinarySearchTreeNode node){
		
		if(node == null)
			return null;
		else{
			if(node.getLeftNode() == null)
				return node;
			
			return getMinNode(node.getLeftNode());
		}		
	}

}
