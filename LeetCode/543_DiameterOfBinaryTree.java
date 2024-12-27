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
    static class Info{
        int dia;
        int ht;
        Info(int dia, int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public Info diameter(TreeNode root){
        if(root==null){
            return new Info(-1,-1);
        }
        Info li=diameter(root.left);
        Info ri=diameter(root.right);
        int fd=Math.max(Math.max(li.dia, ri.dia), li.ht+ri.ht+2);
        int fh=Math.max(li.ht, ri.ht)+1;
        return new Info(fd,fh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
}