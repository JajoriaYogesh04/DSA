import java.util.* ;
import java.io.*; 
/*************************************************************
 
    Following is the Binary Tree node structure:

    class BinaryTreeNode 
    {
    
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

*************************************************************/

public class Solution {
    public static BinaryTreeNode mirror(BinaryTreeNode root){
        if(root==null) return null;
        BinaryTreeNode left=mirror(root.left);
        BinaryTreeNode right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
	public static void mirrorTree(BinaryTreeNode node) {
		// Write your code here.
        mirror(node);
	}
}