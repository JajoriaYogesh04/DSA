

/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution
{
    int helper(Node root,int maxi[]){
        if(root==null)return 0;
        int ls=Math.max(helper(root.left,maxi),0);
        int rs=Math.max(helper(root.right,maxi),0);
        maxi[0]=Math.max(maxi[0],ls+rs+root.data);
        return Math.max(ls,rs)+root.data;
    }
    //Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node)
    {
        //your code goes here
        int maxi[]={Integer.MIN_VALUE};
        helper(node,maxi);
        return maxi[0];
    }
}