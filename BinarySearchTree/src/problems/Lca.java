package problems;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class Lca {

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		BinarySearchTreeNode node1 = new BinarySearchTreeNode(60);
		BinarySearchTreeNode node2 = new BinarySearchTreeNode(75);
		
		BinarySearchTreeNode node = findLca(rootNode,node1,node2);
		if(node != null)
			System.out.println("LCA is: "+node.getData());
		else
			System.out.println("Nodes not found");
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
