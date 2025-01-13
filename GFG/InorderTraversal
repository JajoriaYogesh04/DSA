

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
        list.add(root.data);
        traversal(root.right, list);
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list= new ArrayList<>();
        traversal(root, list);
        return list;
    }
}