package problems;

import printValues.InOrderPrint;
import createBinarySearchTree.BinarySearchTreeNode;

public class CreateBalancedBST {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		BinarySearchTreeNode rootNode = construct(nums,0,nums.length-1);
		
		InOrderPrint.display(rootNode);
	}
	
	private static BinarySearchTreeNode construct(int[] numArr,int start,int end){
		
		if(start > end)
			return null;
		
		int middle = (start + end) / 2;
		BinarySearchTreeNode node = new BinarySearchTreeNode(numArr[middle]);		
		node.setLeftNode(construct(numArr,start,middle-1));
		node.setRightNode(construct(numArr, middle+1, end));
		return node;
	}

}
