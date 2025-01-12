public class MaximumPathSum{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes == null || idx >= nodes.length || nodes[idx] == -1)return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static int maximumPathSum(Node root,int maxi[]){
            if(root==null)return 0;
            int leftSum=Math.max(maximumPathSum(root.left,maxi),0);
            int rightSum=Math.max(maximumPathSum(root.right,maxi),0);
            maxi[0]=Math.max(maxi[0],leftSum+rightSum+root.data);
            return Math.max(leftSum,rightSum)+root.data; 
        }
    }
    public static void main(String args[]){
        // Test Case 1: Mixed positive and negative values
        testMaximumPathSum(new int[]{-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1}, "Test Case 1");

        // Test Case 2: Single node tree
        testMaximumPathSum(new int[]{5}, "Test Case 2");

        // Test Case 3: Only left children
        testMaximumPathSum(new int[]{1, 2, -1, -1, 3, -1, -1}, "Test Case 3");

        // Test Case 4: Only right children
        testMaximumPathSum(new int[]{1, -1, 2, -1, 3, -1, -1}, "Test Case 4");

        // Test Case 5: Empty tree
        testMaximumPathSum(new int[]{-1}, "Test Case 5");

        // Additional Test Cases
        // Test Case 6: Balanced tree with all positive values
        testMaximumPathSum(new int[]{1, 2, -1, -1, 3, -1, -1}, "Test Case 6");
    }
    public static void testMaximumPathSum(int[] nodes, String testCaseName) {
        BinaryTree.idx = -1; // Reset the index before building a new tree
        Node root = BinaryTree.buildTree(nodes);
        int[] maxi = {Integer.MIN_VALUE};
        BinaryTree.maximumPathSum(root, maxi);
        System.out.println(testCaseName + ": Maximum Path Sum = " + maxi[0]);
    }
}