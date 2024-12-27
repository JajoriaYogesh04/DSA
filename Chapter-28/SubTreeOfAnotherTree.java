public class SubTreeOfAnotherTree{
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
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        public static boolean isIdentical(Node node, Node subRoot){
            if(node==null && subRoot==null){
                return true;
            }
            else if(node==null || subRoot==null || node.data!=subRoot.data){
                return false;
            }
            return isIdentical(node.left, subRoot.left) && isIdentical(node.right,subRoot.right);
        }
        public static boolean isSubTree(Node root, Node subRoot){
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
        }
    }
    public static void main(String args[]){
        // Test Case 1: Subtree is present in the middle of the tree
    int nodes1[] = {8, 3, 1, -1, -1, 6, 4, -1, -1, 7, -1, -1, 10, -1, 14, 13, -1, -1, -1};
    int subNodes1[] = {3, 1, -1, -1, 6, 4, -1, -1, 7, -1, -1};
    BinaryTree.idx = -1;
    Node root1 = BinaryTree.buildTree(nodes1);
    BinaryTree.idx = -1;
    Node subRoot1 = BinaryTree.buildTree(subNodes1);
    System.out.println("Test Case 1: " + BinaryTree.isSubTree(root1, subRoot1)); // Expected: true

    // Test Case 2: Subtree not present
    int subNodes2[] = {6, 8, -1, -1, 10, -1, -1};
    BinaryTree.idx = -1;
    Node subRoot2 = BinaryTree.buildTree(subNodes2);
    System.out.println("Test Case 2: " + BinaryTree.isSubTree(root1, subRoot2)); // Expected: false

    // Test Case 3: Subtree at the leaf node
    int subNodes3[] = {14, 13, -1, -1, -1};
    BinaryTree.idx = -1;
    Node subRoot3 = BinaryTree.buildTree(subNodes3);
    System.out.println("Test Case 3: " + BinaryTree.isSubTree(root1, subRoot3)); // Expected: true

    // Test Case 4: Main tree is a single node
    int nodes4[] = {5, -1, -1};
    int subNodes4[] = {5, -1, -1};
    BinaryTree.idx = -1;
    Node root4 = BinaryTree.buildTree(nodes4);
    BinaryTree.idx = -1;
    Node subRoot4 = BinaryTree.buildTree(subNodes4);
    System.out.println("Test Case 4: " + BinaryTree.isSubTree(root4, subRoot4)); // Expected: true

    // Test Case 5: Subtree has nodes that don’t exist in the main tree
    int subNodes5[] = {20, 15, -1, -1, 25, -1, -1};
    BinaryTree.idx = -1;
    Node subRoot5 = BinaryTree.buildTree(subNodes5);
    System.out.println("Test Case 5: " + BinaryTree.isSubTree(root1, subRoot5)); // Expected: false

    // Test Case 7: Subtree not matching due to different structure
    int nodes7[] = {5, 3, 2, -1, -1, -1, 7, -1, -1};
    int subNodes7[] = {5, -1, 3, -1, -1};
    BinaryTree.idx = -1;
    Node root7 = BinaryTree.buildTree(nodes7);
    BinaryTree.idx = -1;
    Node subRoot7 = BinaryTree.buildTree(subNodes7);
    System.out.println("Test Case 7: " + BinaryTree.isSubTree(root7, subRoot7)); // Expected: false
    }
}