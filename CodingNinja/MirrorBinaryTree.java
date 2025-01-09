/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer>root){
		if(root==null) return null;
		BinaryTreeNode<Integer>left=mirror(root.left);
		BinaryTreeNode<Integer>right=mirror(root.right);
		root.left=right;
		root.right=left;
		return root;
	}
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		mirror(root);
	}
	
}