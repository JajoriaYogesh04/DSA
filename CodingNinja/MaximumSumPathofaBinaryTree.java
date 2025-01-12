/************************************************************

 Following is the BinaryTreeNode class structure
 class BinaryTreeNode<T>
 {
     public:
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;
    
     BinaryTreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };
 ************************************************************/
public class Solution {
    public static int helper(BinaryTreeNode<Integer>root,int maxi[]){
        if(root==null)return 0;
        int leftSum=Math.max(helper(root.left,maxi),0);
        int rightSum=Math.max(helper(root.right,maxi),0);
        maxi[0]=Math.max(maxi[0],leftSum+rightSum+root.data);
        return Math.max(leftSum,rightSum)+root.data;
    }
    public static int maxPathSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        int maxi[]={Integer.MIN_VALUE};
        helper(root,maxi);
        return maxi[0];
    }
}
