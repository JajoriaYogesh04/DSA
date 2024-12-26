

// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null){
            return 0;
        }
        int lc= countNodes(root.left);
        int rc= countNodes(root.right);
        return lc+rc+1;
    }
}