package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class FindMax {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		
		BinarySearchTreeNode maxNode = getMaxNode(rootNode);
		
		System.out.println("Max Node Value: "+maxNode.getData());
	}
	
	public static BinarySearchTreeNode getMaxNode(BinarySearchTreeNode node){
		
		if(node == null)
			return null;
		else{
			if(node.getRightNode() == null)
				return node;
			else
				return getMaxNode(node.getRightNode());
		}
	}

}
