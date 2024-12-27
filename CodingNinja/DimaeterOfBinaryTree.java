/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
     public T data;
     public BinaryTreeNode<T> left;
     public BinaryTreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }

 *************************************************************/

public class Solution {
    static class Info{
        int dia;
        int ht;
        Info(int dia, int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info diameter(TreeNode<Integer> root){
        if(root==null){
            return new Info(-1,-1);
        }
        Info leftInfo= diameter(root.left);
        Info rightInfo= diameter(root.right);
        int finalDia= Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht+rightInfo.ht+2);
        int finalHt= Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(finalDia, finalHt);
    }
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        return diameter(root).dia;
    }
}