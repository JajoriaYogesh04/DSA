public class DeleteLeafNodeX{
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
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static Node deleteNode(Node root,int x){
            if(root == null){
                return null;
            }
            root.left=deleteNode(root.left,x);
            root.right=deleteNode(root.right,x);
            if(root.left==null && root.right==null && root.data==x){
                return null;
            }
            return root;
        }
        public static void preOrder(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String args[]){
        // int nodes[]={1,3,3,-1,-1,2,-1,-1,3,-1,-1};
        // Node root=BinaryTree.buildTree(nodes);
        // // System.out.println(root.left.left.data);
        // BinaryTree.deleteNode(root,3);
        // BinaryTree.preOrder(root);
        // Test Case 1: Original Test Case
        System.out.println("Test Case 1: Original Tree");
        int nodes1[] = {1, 3, 3, -1, -1, 2, -1, -1, 3, -1, -1};
        Node root1 = BinaryTree.buildTree(nodes1);
        root1 = BinaryTree.deleteNode(root1, 3);
        BinaryTree.preOrder(root1);
        System.out.println("\n");

        // Test Case 2: Tree with no matching leaf nodes to delete
        System.out.println("Test Case 2: No Matching Leaf Nodes to Delete");
        int nodes2[] = {4, 2, -1, -1, 5, -1, -1};
        BinaryTree.idx = -1;
        Node root2 = BinaryTree.buildTree(nodes2);
        root2 = BinaryTree.deleteNode(root2, 3);
        BinaryTree.preOrder(root2);
        System.out.println("\n");

        // Test Case 3: Tree with only one node (root is the leaf to be deleted)
        System.out.println("Test Case 3: Single Node Tree");
        int nodes3[] = {7, -1, -1};
        BinaryTree.idx = -1;
        Node root3 = BinaryTree.buildTree(nodes3);
        root3 = BinaryTree.deleteNode(root3, 7);
        BinaryTree.preOrder(root3); // Should print nothing
        System.out.println("\n");

        // Test Case 4: Tree where all nodes are leaves with the same value
        System.out.println("Test Case 4: All Leaves with Same Value");
        int nodes4[] = {8, 8, -1, -1, 8, -1, -1};
        BinaryTree.idx = -1;
        Node root4 = BinaryTree.buildTree(nodes4);
        root4 = BinaryTree.deleteNode(root4, 8);
        BinaryTree.preOrder(root4); // Should print nothing
        System.out.println("\n");

        // Test Case 5: Tree with different leaf values, delete specific leaf
        System.out.println("Test Case 5: Different Leaf Values");
        int nodes5[] = {10, 20, -1, -1, 30, 40, -1, -1, -1};
        BinaryTree.idx = -1;
        Node root5 = BinaryTree.buildTree(nodes5);
        root5 = BinaryTree.deleteNode(root5, 40);
        BinaryTree.preOrder(root5);
        System.out.println("\n");
    }
}