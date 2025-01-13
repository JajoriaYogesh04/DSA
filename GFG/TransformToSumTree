

//User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int lc=sumTree(root.left);
        int rc=sumTree(root.right);
        int data=root.data;
        int nl=root.left==null?0:root.left.data;
        int nr=root.right==null?0:root.right.data;
        root.data=lc+nl+rc+nr;
        return data;
    }
    public void toSumTree(Node root){
         //add code here.
         sumTree(root);
    }
}