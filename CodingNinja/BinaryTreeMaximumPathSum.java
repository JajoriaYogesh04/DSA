import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> {
	    public T val;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T val) {
	        this.val = val;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution {
	public static int helper(TreeNode<Integer>root,int maxi[]){
		if(root==null)return 0;
		int ls=Math.max(helper(root.left,maxi),0);
		int rs=Math.max(helper(root.right,maxi),0);
		maxi[0]=Math.max(maxi[0],ls+rs+root.val);
		return Math.max(ls,rs)+root.val;
	}
	public static int maxPathSum(TreeNode<Integer> root) {
		// Write your code here.
		int maxi[]={Integer.MIN_VALUE};
		helper(root,maxi);
		return maxi[0];
	}
}