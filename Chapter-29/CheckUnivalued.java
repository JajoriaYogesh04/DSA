public class CheckUnivalued{
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
        static int i=-1;
        public static Node buildTree(int nodes[]){
            i++;
            if(i>=nodes.length || nodes[i]==-1){
                return null;
            }
            Node newNode= new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static boolean checkUnivalued(Node root){
            if(root==null) return true;
            if(root.left!=null && root.left.data!=root.data) return false;
            if(root.right!=null && root.right.data!=root.data) return false;
            return checkUnivalued(root.left)&&checkUnivalued(root.right);
        }
    }
    public static void main(String args[]){
        // Test Case 1: Univalued Tree
        int nodes1[] = {2, 2, 2, -1, -1, 2, -1, -1, 2, -1, -1};
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.println(BinaryTree.checkUnivalued(root1)); // Expected: true

        // Test Case 2: Non-Univalued Tree
        int nodes2[] = {2, 2, 5, -1, -1, 2, -1, -1, 2, -1, -1};
        BinaryTree.i=-1;
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.println(BinaryTree.checkUnivalued(root2)); // Expected: false

        // Test Case 3: Single Node Tree
        int nodes3[] = {1, -1, -1};
        BinaryTree.i=-1;
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.println(BinaryTree.checkUnivalued(root3)); // Expected: true

        // Test Case 4: Empty Tree
        int nodes4[] = {-1};
        BinaryTree.i=-1;
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.println(BinaryTree.checkUnivalued(root4)); // Expected: true

        // Test Case 5: Univalued Tree with Larger Depth
        int nodes5[] = {1, 1, 1, -1, -1, 1, -1, -1};
        BinaryTree.i=-1;
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.println(BinaryTree.checkUnivalued(root5)); // Expected: true

        // Test Case 6: Tree with Same Value but Different Structure
        int nodes6[] = {7, 7, 7, -1, -1, 7, -1, -1};
        BinaryTree.i=-1;
        Node root6 = BinaryTree.buildTree(nodes6);
        System.out.println(BinaryTree.checkUnivalued(root6)); // Expected: true
    }
}