package printValues;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class InOrderPrint {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		display(rootNode);
	}
	
	public static void display(BinarySearchTreeNode node){
		
		if(node == null)
			return;
		
		display(node.getLeftNode());
		System.out.print(node.getData()+" ");
		display(node.getRightNode());
	}

}
