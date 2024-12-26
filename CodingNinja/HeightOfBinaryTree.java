/************************************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {
        // Write your code here.
        if(root==null){
            return 0;
        }
        int lh=heightOfBinaryTree(root.left);
        int rh=heightOfBinaryTree(root.right);
        return Math.max(lh,rh)+1;
    }
}