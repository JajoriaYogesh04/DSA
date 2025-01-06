

//User function Template for Java

/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution
{
    static int ancestor=-1;
    public int helper(Node root,int k,int node){
        if(root==null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }
        int ld=helper(root.left,k,node);
        int rd=helper(root.right,k,node);
        int dist=Math.max(ld,rd)+1;
        if(ld==-1&&rd==-1){
            return -1;
        }
        if(dist==k){
            ancestor=root.data;
        }
        return dist;
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ancestor=-1;
        helper(root,k,node);
        return ancestor;
    }
}