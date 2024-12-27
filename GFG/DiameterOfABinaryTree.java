

// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    static class Info{
        int dia;
        int ht;
        Info(int dia, int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    Info helper(Node root){
        if(root==null){
            return new Info(-1,-1);
        }
        Info li= helper(root.left);
        Info ri= helper(root.right);
        int fd= Math.max(Math.max(li.dia, ri.dia), li.ht+ri.ht+2);
        int fh= Math.max(li.ht,ri.ht)+1;
        return new Info(fd,fh);
    }
    int diameter(Node root) {
        // Your code here
        return helper(root).dia;
    }
}