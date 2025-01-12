/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int helper(TreeNode root,int maxi[]){
        if(root==null)return 0;
        int ls=Math.max(helper(root.left,maxi),0);
        int rs=Math.max(helper(root.right,maxi),0);
        maxi[0]=Math.max(maxi[0],ls+rs+root.val);
        return Math.max(ls,rs)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        int maxi[]={Integer.MIN_VALUE};
        helper(root,maxi);
        return maxi[0];
    }
}