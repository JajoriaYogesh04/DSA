/************************************************************

    Following is the TreeNode class structure:

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
    public static int sumTree(TreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int leftchild=sumTree(root.left);
        int rightchild=sumTree(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=newleft+leftchild+newright+rightchild;
        return data;
    }
    public static TreeNode<Integer> convertToSumTree(TreeNode<Integer> root) {
        // Write your code here.
        sumTree(root);
        return root;
    }
}