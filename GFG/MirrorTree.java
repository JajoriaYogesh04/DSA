

// User function Template for Java

// function Template for Java

// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    Node helper(Node root){
        if(root==null) return null;
        Node left=helper(root.left);
        Node right=helper(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        helper(node);
    }
}