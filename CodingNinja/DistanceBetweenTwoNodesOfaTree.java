import java.util.* ;
import java.io.*; 
/*************************************************************

	Following is the TreeNode class structure

	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val)
		{
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

 *************************************************************/

public class Solution
{
	public static TreeNode lowestCommonAncestor(TreeNode root, int n1, int n2){
		if(root==null||root.val==n1||root.val==n2){
			return root;
		}
		TreeNode leftlca= lowestCommonAncestor(root.left,n1,n2);
		TreeNode rightlca= lowestCommonAncestor(root.right,n1,n2);
		if(leftlca==null){
			return rightlca;
		} 
		if(rightlca==null){
			return leftlca;
		}
		return root;
	}
	public static int distanceBetweenNodes(TreeNode root, int n){
		if(root==null){
			return -1;
		}
		if(root.val==n){
			return 0;
		}
		int ld= distanceBetweenNodes(root.left,n);
		int rd= distanceBetweenNodes(root.right,n);
		if(ld==-1&&rd==-1){
			return -1;
		}
		return (ld==-1?rd:ld)+1;
	}
	public static int findDistanceBetweenNodes(TreeNode root, int node1, int node2)
	{
		// Write your code here.
		TreeNode lca=lowestCommonAncestor(root,node1,node2);
		if(distanceBetweenNodes(root,node1)==-1||distanceBetweenNodes(root,node2)==-1){
			return -1;
		}
		int d1=distanceBetweenNodes(lca,node1);
		int d2=distanceBetweenNodes(lca,node2);
		return d1+d2;
	}
}