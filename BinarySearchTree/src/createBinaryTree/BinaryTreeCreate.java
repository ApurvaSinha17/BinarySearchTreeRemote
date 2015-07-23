package createBinaryTree;

import createBinarySearchTree.BinarySearchTreeNode;


public class BinaryTreeCreate {

	/*
	 *				1
	 * 		2				5		
	 * 	3		4		6		7	
	 */
	public static BinarySearchTreeNode createFullBinaryTree(){
		
		BinarySearchTreeNode rootNode = new BinarySearchTreeNode();
		rootNode.setData(1);
		
		BinarySearchTreeNode l1  = new BinarySearchTreeNode();
		l1.setData(2);
		BinarySearchTreeNode l2  = new BinarySearchTreeNode();
		l2.setData(3);
		BinarySearchTreeNode l3  = new BinarySearchTreeNode();
		l3.setData(4);
		
		BinarySearchTreeNode r1 = new BinarySearchTreeNode();
		r1.setData(5);
		BinarySearchTreeNode r2 = new BinarySearchTreeNode();
		r2.setData(6);
		BinarySearchTreeNode r3 = new BinarySearchTreeNode();
		r3.setData(7);
				
		rootNode.setLeftNode(l1);
		rootNode.setRightNode(r1);
		
		l1.setLeftNode(l2);
		l1.setRightNode(l3);
		
		r1.setLeftNode(r2);
		r1.setRightNode(r3);
		
		return rootNode;
	}
	
	/*
	 *				1
	 * 		5				2		
	 * 	7		6		4		3	
	 * 								9
	 */
	public static BinarySearchTreeNode createMirrorBinaryTree(){
		
		BinarySearchTreeNode rootNode = new BinarySearchTreeNode();
		rootNode.setData(1);
		
		BinarySearchTreeNode l1  = new BinarySearchTreeNode();
		l1.setData(5);
		BinarySearchTreeNode l2  = new BinarySearchTreeNode();
		l2.setData(7);
		BinarySearchTreeNode l3  = new BinarySearchTreeNode();
		l3.setData(6);
		
		BinarySearchTreeNode r1 = new BinarySearchTreeNode();
		r1.setData(2);
		BinarySearchTreeNode r2 = new BinarySearchTreeNode();
		r2.setData(4);
		BinarySearchTreeNode r3 = new BinarySearchTreeNode();
		r3.setData(3);
				
		rootNode.setLeftNode(l1);
		rootNode.setRightNode(r1);
		
		l1.setLeftNode(l2);
		l1.setRightNode(l3);
		
		r1.setLeftNode(r2);
		r1.setRightNode(r3);
		
		/*BinarySearchTreeNode r4 = new BinarySearchTreeNode();
		r4.setData(9);	
		r3.setRightNode(r4);*/
		
		return rootNode;
	}
	
	/*
	 *						1
	 * 			2						5		
	 * 	3				4			6		7	
	 * 		8
	 */
	public static BinarySearchTreeNode createCompleteBinaryTree(){
		
		BinarySearchTreeNode rootNode = createFullBinaryTree();
		BinarySearchTreeNode node = rootNode;
		BinarySearchTreeNode l4 = new BinarySearchTreeNode();
		l4.setData(8);
		BinarySearchTreeNode prev = null;
		while(node != null){
			prev = node;
			node = node.getLeftNode();
		}
		prev.setRightNode(l4);	
		
		return rootNode;
	}
		
	/*
	 * 			2
	 * 3				4
	 * 		8
	 */
	public static BinarySearchTreeNode createSubTree(){
		
		BinarySearchTreeNode rootNode = new BinarySearchTreeNode();
		rootNode.setData(2);
		
		BinarySearchTreeNode l  = new BinarySearchTreeNode();
		l.setData(3);
		BinarySearchTreeNode r  = new BinarySearchTreeNode();
		r.setData(4);
		BinarySearchTreeNode lr = new BinarySearchTreeNode();
		lr.setData(8);
		
		rootNode.setLeftNode(l);
		rootNode.setRightNode(r);
		l.setRightNode(lr);
		
		return rootNode;
	}
	
	/*
	 *						1
	 * 			2						5		
	 * 	3				4			6		7	
	 * 		9
	 */
	public static BinarySearchTreeNode createAnotherCompleteBinaryTree(){
		
		BinarySearchTreeNode rootNode = createFullBinaryTree();
		BinarySearchTreeNode node = rootNode;
		BinarySearchTreeNode l4 = new BinarySearchTreeNode();
		l4.setData(9);
		BinarySearchTreeNode prev = null;
		while(node != null){
			prev = node;
			node = node.getLeftNode();
		}
		prev.setRightNode(l4);		
		return rootNode;
	}
}
