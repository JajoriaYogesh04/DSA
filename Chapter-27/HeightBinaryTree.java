public class HeightBinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=right;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lheight= height(root.left);
            int rheight= height(root.right);
            return Math.max(lheight, rheight)+1;
        }
    }
    public static void main(String args[]){
        // Test Case 1: General binary tree
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.idx = -1; // Reset idx for new tree
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.println("Test Case 1 Height: " + BinaryTree.height(root1)); // Expected: 3

        // Test Case 2: Single node tree
        int nodes2[] = {1, -1, -1};
        BinaryTree.idx = -1;
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.println("Test Case 2 Height: " + BinaryTree.height(root2)); // Expected: 1

        // Test Case 3: Empty tree
        int nodes3[] = {-1};
        BinaryTree.idx = -1;
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.println("Test Case 3 Height: " + BinaryTree.height(root3)); // Expected: 0

        // Test Case 4: Left-skewed tree
        int nodes4[] = {1, 2, 3, 4, -1, -1, -1, -1, -1};
        BinaryTree.idx = -1;
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.println("Test Case 4 Height: " + BinaryTree.height(root4)); // Expected: 4

        // Test Case 5: Right-skewed tree
        int nodes5[] = {1, -1, 2, -1, 3, -1, 4, -1, -1};
        BinaryTree.idx = -1;
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.println("Test Case 5 Height: " + BinaryTree.height(root5)); // Expected: 4
    }
}