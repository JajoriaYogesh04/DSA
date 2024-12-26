public class CountNodesBinaryTree{
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
        static int idx= -1;
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
        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int lc= countNodes(root.left);
            int rc= countNodes(root.right);
            return lc+rc+1;
        }
    }
    public static void main(String args[]){
        // Test Case 1: Standard binary tree
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.idx=-1;
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.println("Test Case 1 (Expected: 6): " + BinaryTree.countNodes(root1));

        // Test Case 2: Single node tree
        int nodes2[] = {1, -1, -1};
        BinaryTree.idx=-1;
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.println("Test Case 2 (Expected: 1): " + BinaryTree.countNodes(root2));

        // Test Case 3: Empty tree
        int nodes3[] = {-1};
        BinaryTree.idx=-1;
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.println("Test Case 3 (Expected: 0): " + BinaryTree.countNodes(root3));

        // Test Case 4: Tree with all left children
        int nodes4[] = {1, 2, 3, -1, -1, -1, -1};
        BinaryTree.idx=-1;
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.println("Test Case 4 (Expected: 3): " + BinaryTree.countNodes(root4));

        // Test Case 5: Tree with all right children
        int nodes5[] = {1, -1, 2, -1, 3, -1, -1};
        BinaryTree.idx=-1;
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.println("Test Case 5 (Expected: 3): " + BinaryTree.countNodes(root5));
    }
}