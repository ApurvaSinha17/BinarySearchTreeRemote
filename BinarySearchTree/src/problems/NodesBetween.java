package problems;

import java.util.ArrayList;
import java.util.List;

import createBinarySearchTree.BinarySearchTree;
import createBinarySearchTree.BinarySearchTreeNode;

public class NodesBetween {

	private static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		BinarySearchTreeNode rootNode = BinarySearchTree.createBinarySearchTree();
		int k1 = 175;
		int k2 = 82;
		checkNode(rootNode,k1,k2);
		for(Integer i : list)
			System.out.print(i+" ");
	}

	private static void checkNode(BinarySearchTreeNode node,int k1,int k2){
		
		if(k1 < k2)
			addNode(node, k1, k2);
		else
			addNode(node, k2, k1);
	}
	
	private static void addNode(BinarySearchTreeNode node,int small,int large){
		
		if(node == null)
			return;
		
		if(node.getData() > small)
			addNode(node.getLeftNode(), small, large);
		
		if(node.getData() >= small && node.getData() <= large)
			list.add(node.getData());
		
		if(node.getData() < large)
			addNode(node.getRightNode(), small, large);
	}
}
