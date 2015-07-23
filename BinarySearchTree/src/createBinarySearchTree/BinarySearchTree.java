package createBinarySearchTree;

/*
 * 										100
 * 			50												150
 * 	40					70							120				170
 * 				60				80				110						180
 * 							75		85
 */
public class BinarySearchTree {

	public static BinarySearchTreeNode createBinarySearchTree(){
		
		BinarySearchTreeNode rootNode = new BinarySearchTreeNode();
		rootNode.setData(100);
		
		BinarySearchTreeNode nodeL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLR = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLRL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLRR = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLRRL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeLRRR = new BinarySearchTreeNode();
		
		nodeL.setData(50);
		nodeLL.setData(40);
		nodeLR.setData(70);
		nodeLRL.setData(60);
		nodeLRR.setData(80);
		nodeLRRL.setData(75);
		nodeLRRR.setData(85);
		
		BinarySearchTreeNode nodeR = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeRL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeRLL = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeRR = new BinarySearchTreeNode();
		BinarySearchTreeNode nodeRRR = new BinarySearchTreeNode();
		
		nodeR.setData(150);
		nodeRL.setData(120);
		nodeRLL.setData(110);
		nodeRR.setData(170);
		nodeRRR.setData(180);
		
		rootNode.setLeftNode(nodeL);
		rootNode.setRightNode(nodeR);
		
		nodeL.setLeftNode(nodeLL);
		nodeL.setRightNode(nodeLR);
		
		nodeLR.setLeftNode(nodeLRL);
		nodeLR.setRightNode(nodeLRR);
		
		nodeLRR.setLeftNode(nodeLRRL);
		nodeLRR.setRightNode(nodeLRRR);
		
		nodeR.setLeftNode(nodeRL);
		nodeRL.setLeftNode(nodeRLL);
		
		nodeR.setRightNode(nodeRR);
		nodeRR.setRightNode(nodeRRR);
		
		return rootNode;
	}
}
