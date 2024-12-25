

// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        // Your code here
        ArrayList<Integer> list= new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node top= q.remove();
            list.add(top.data);
            if(top.left!=null){
                q.add(top.left);
            }
            if(top.right!=null){
                q.add(top.right);
            }
        }
        return list;
    }
}