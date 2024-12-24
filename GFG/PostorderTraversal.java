

// User function Template for Java

// User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    void traversal(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        traversal(root.left, list);
        traversal(root.right, list);
        list.add(root.data);
    }
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> list= new ArrayList<>();
        traversal(root, list);
        return list;
    }
}