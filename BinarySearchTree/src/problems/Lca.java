package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class Lca {
	
	private static boolean firstNodeFound = false;
	private static boolean secondNodeFound = false;

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		BinarySearchTreeNode node1 = new BinarySearchTreeNode(40);
		BinarySearchTreeNode node2 = new BinarySearchTreeNode(85);
		
		//Pre-condition: Check whether both the nodes are present in the Binary Search Tree
		bothNodesFound(rootNode,node1,node2);
		
		if (firstNodeFound && secondNodeFound) {
			BinarySearchTreeNode node = findLca(rootNode, node1, node2);
			if (node != null)
				System.out.println("LCA is: " + node.getData());
		}
		else{
			if(!firstNodeFound && !secondNodeFound)
				System.out.println("Both nodes not found in the Binary Tree");
			else{
				BinarySearchTreeNode nodeNodeFound = !firstNodeFound ? node1 : node2;
				System.out.println("Node "+nodeNodeFound.getData()+" not found in the Binary Tree");
			}
		}
		
	}
	
	private static void bothNodesFound(BinarySearchTreeNode node, BinarySearchTreeNode node1, BinarySearchTreeNode node2){
		
		firstNodeFound = findNode(node,node1);
		secondNodeFound = findNode(node,node2);
	}
	
	private static boolean findNode(BinarySearchTreeNode node, BinarySearchTreeNode x){
		
		if(node == null)
			return false;
		
		if(node.getData() == x.getData())
			return true;
		else if(node.getData() < x.getData())
			return findNode(node.getRightNode(),x);
		else
			return findNode(node.getLeftNode(),x);
			 
	}
	
	private static BinarySearchTreeNode findLca(BinarySearchTreeNode node, BinarySearchTreeNode node1, BinarySearchTreeNode node2){
		
		if(node == null)
			return null;
		
		if((node.getData() <= node1.getData() && node.getData() >= node2.getData()) || (node.getData() >= node1.getData() && node.getData() <= node2.getData())){
			return node;
		}
		else{
			if(node.getData() < node1.getData())
				return findLca(node.getRightNode(), node1, node2);
			else
				return findLca(node.getLeftNode(), node1, node2);
		}

	}

}
