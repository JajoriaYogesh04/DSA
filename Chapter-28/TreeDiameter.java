public class TreeDiameter{
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
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftdia= diameter(root.left);
            int rightdia= diameter(root.right);
            int lh= height(root.left);
            int rh=height(root.right);
            int selfdia= lh+rh+1;
            return Math.max(Math.max(leftdia,rightdia), selfdia);
        }
    }
    public static void main(String args[]){
        // Test case 1: Provided tree
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree.idx=-1;
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.println("Diameter of tree 1: " + BinaryTree.diameter(root1)); // Expected: 5
        

        // Test case 2: Single node tree
        int nodes2[] = { 1, -1, -1 };
        BinaryTree.idx=-1;
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.println("Diameter of tree 2: " + BinaryTree.diameter(root2)); // Expected: 1
        

        // Test case 3: Empty tree
        int nodes3[] = { -1 };
        BinaryTree.idx=-1;
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.println("Diameter of tree 3: " + BinaryTree.diameter(root3)); // Expected: 0
        

        // Test case 4: Unbalanced tree
        int nodes4[] = { 1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1 };
        BinaryTree.idx=-1;
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.println("Diameter of tree 4: " + BinaryTree.diameter(root4)); // Expected: 4
        

        // Test case 5: Complete binary tree
        int nodes5[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree.idx=-1;
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.println("Diameter of tree 5: " + BinaryTree.diameter(root5)); // Expected: 5
    }
}