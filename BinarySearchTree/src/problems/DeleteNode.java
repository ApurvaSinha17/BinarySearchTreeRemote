package problems;

import printValues.InOrderPrint;
import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class DeleteNode {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		
		//Node to delete
		int data = 70;
		
		deleteNode(rootNode,data);

		//In order printing of Binary Search Tree
		InOrderPrint.display(rootNode);
	}
	
	public static BinarySearchTreeNode deleteNode(BinarySearchTreeNode node,int data){
		
		BinarySearchTreeNode temp = null;
		if(node == null)
			return null;
		else if(data < node.getData())
			node.setLeftNode(deleteNode(node.getLeftNode(),data));
		else if(data > node.getData())
			node.setRightNode(deleteNode(node.getRightNode(),data));
		else{
			if(node.getLeftNode() != null && node.getRightNode() != null){
				temp = FindMax.getMaxNode(node.getLeftNode());
				node.setData(temp.getData());
				node.setLeftNode(deleteNode(node.getLeftNode(), temp.getData()));
			}
			else{
				temp = node;
				if(node.getLeftNode() != null)
					node = node.getLeftNode();
				else
					node = node.getRightNode();
				temp = null;
			}
		}
		
		return node;
	}

}
