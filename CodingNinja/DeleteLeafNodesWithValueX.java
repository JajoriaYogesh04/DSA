/*
    Following is the representation of a Binary Tree Node

    class BinaryTreeNode<T> 
    {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) 
        {
            this.data = data;
        }
    }

*/

public class Solution 
{
    public static BinaryTreeNode<Integer> deleteLeafNodes(BinaryTreeNode<Integer> root, int x) 
    {
        //Your code goes here
        if(root==null) return null;
        root.left=deleteLeafNodes(root.left,x);
        root.right=deleteLeafNodes(root.right,x);
        if(root.left==null&&root.right==null&&root.data==x){
            return null;
        }
        return root;
    }
}