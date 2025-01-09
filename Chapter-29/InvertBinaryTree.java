public class InvertBinaryTree{
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
        public static Node invertBinaryTree(Node root){
            if(root==null) return null;
            // if(root.left!=null && root.right!=null){
            //     Node temp=root.left;
            //     root.left=root.right;
            //     root.right=temp;
            // }
            // if(root.left==null){
            //     root.left=root.right;
            // }
            // if(root.right==null){
            //     root.right=root.left;
            // }
            Node left=invertBinaryTree(root.left);
            Node right=invertBinaryTree(root.right);
            root.left= right;
            root.right=left;
            return root;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String args[]){
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        // Node root= BinaryTree.buildTree(nodes);
        // BinaryTree.invertBinaryTree(root);
        // BinaryTree.preOrder(root);
         // Test Case 1: Standard Binary Tree
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree.idx = -1;  // Reset idx for new tree
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.print("Original Tree 1 PreOrder: ");
        BinaryTree.preOrder(root1);
        System.out.println();
        BinaryTree.invertBinaryTree(root1);
        System.out.print("Inverted Tree 1 PreOrder: ");
        BinaryTree.preOrder(root1);
        System.out.println();

        // Test Case 2: Left-skewed Binary Tree
        int nodes2[] = {1, 2, 3, -1, -1, -1, -1};
        BinaryTree.idx = -1;  // Reset idx for new tree
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.print("Original Tree 2 PreOrder: ");
        BinaryTree.preOrder(root2);
        System.out.println();
        BinaryTree.invertBinaryTree(root2);
        System.out.print("Inverted Tree 2 PreOrder: ");
        BinaryTree.preOrder(root2);
        System.out.println();

        // Test Case 3: Right-skewed Binary Tree
        int nodes3[] = {1, -1, 2, -1, 3, -1, -1};
        BinaryTree.idx = -1;  // Reset idx for new tree
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.print("Original Tree 3 PreOrder: ");
        BinaryTree.preOrder(root3);
        System.out.println();
        BinaryTree.invertBinaryTree(root3);
        System.out.print("Inverted Tree 3 PreOrder: ");
        BinaryTree.preOrder(root3);
        System.out.println();

        // Test Case 4: Single Node Tree
        int nodes4[] = {1, -1, -1};
        BinaryTree.idx = -1;  // Reset idx for new tree
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.print("Original Tree 4 PreOrder: ");
        BinaryTree.preOrder(root4);
        System.out.println();
        BinaryTree.invertBinaryTree(root4);
        System.out.print("Inverted Tree 4 PreOrder: ");
        BinaryTree.preOrder(root4);
        System.out.println();

        // Test Case 5: Empty Tree
        int nodes5[] = {-1};
        BinaryTree.idx = -1;  // Reset idx for new tree
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.print("Original Tree 5 PreOrder: ");
        BinaryTree.preOrder(root5);
        System.out.println();
        BinaryTree.invertBinaryTree(root5);
        System.out.print("Inverted Tree 5 PreOrder: ");
        BinaryTree.preOrder(root5);
        System.out.println();
    }
}