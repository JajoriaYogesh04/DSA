public class SumNodesBinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
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
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        public static int sumNodes(Node root){
            if(root==null){
                return 0;
            }
            int ls= sumNodes(root.left);
            int rs= sumNodes(root.right);
            return ls+rs+root.data;
        }
    }
    public static void main(String args[]){
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Node root= BinaryTree.buildTree(nodes);
        // System.out.println(BinaryTree.sumNodes(root));

        // Test Case 1: Provided example
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.println("Sum of nodes (Test Case 1): " + BinaryTree.sumNodes(root1));

        // Test Case 2: Tree with all nodes having value 0
        int nodes2[] = {0, 0, -1, -1, 0, -1, -1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.println("Sum of nodes (Test Case 2): " + BinaryTree.sumNodes(root2));

        // Test Case 3: Tree with only one node
        int nodes3[] = {7, -1, -1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.println("Sum of nodes (Test Case 3): " + BinaryTree.sumNodes(root3));

        // Test Case 4: Tree with multiple levels and diverse values
        int nodes4[] = {10, 20, -1, -1, 30, 40, -1, -1, 50, -1, -1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.println("Sum of nodes (Test Case 4): " + BinaryTree.sumNodes(root4));

        // Test Case 5: Completely skewed tree (all left children)
        int nodes5[] = {1, 2, 3, 4, -1, -1, -1, -1, -1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.println("Sum of nodes (Test Case 5): " + BinaryTree.sumNodes(root5));

        // Test Case 6: Empty tree
        int nodes6[] = {-1};
        BinaryTree.idx = -1; // Reset static index before building tree
        Node root6 = BinaryTree.buildTree(nodes6);
        System.out.println("Sum of nodes (Test Case 6): " + BinaryTree.sumNodes(root6));
    }
}