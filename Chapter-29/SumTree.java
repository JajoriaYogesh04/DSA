public class SumTree{
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
            if(nodes.length == 0 || idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static int sumTree(Node root){
            if(root==null){
                return 0;
            }
            int data=root.data;
            int leftChild=sumTree(root.left);
            int rightChild=sumTree(root.right);
            int newLeft= root.left==null?0:root.left.data;
            int newRight=root.right==null?0:root.right.data;
            root.data=newLeft+leftChild+newRight+rightChild;
            return data;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void resetIndex() {
            idx = -1;
        }
    }
    public static void main(String args[]){
        // Test Case 1: Basic Tree
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree.resetIndex();
        Node root1 = BinaryTree.buildTree(nodes1);
        BinaryTree.sumTree(root1);
        System.out.print("PreOrder after SumTree (Test 1): ");
        BinaryTree.preOrder(root1);
        System.out.println();

        // Test Case 2: Empty Tree
        int nodes2[] = {};
        BinaryTree.resetIndex();
        Node root2 = BinaryTree.buildTree(nodes2);
        BinaryTree.sumTree(root2);
        System.out.print("PreOrder after SumTree (Test 2): ");
        BinaryTree.preOrder(root2);
        System.out.println();

        // Test Case 3: Single Node Tree
        int nodes3[] = {1, -1, -1};
        BinaryTree.resetIndex();
        Node root3 = BinaryTree.buildTree(nodes3);
        BinaryTree.sumTree(root3);
        System.out.print("PreOrder after SumTree (Test 3): ");
        BinaryTree.preOrder(root3);
        System.out.println();

        // Test Case 4: Larger Complex Tree
        int nodes4[] = {10, -2, 8, -1, -1, -4, -1, -1, 6, 7, -1, -1, 5, -1, -1};
        BinaryTree.resetIndex();
        Node root4 = BinaryTree.buildTree(nodes4);
        BinaryTree.sumTree(root4);
        System.out.print("PreOrder after SumTree (Test 4): ");
        BinaryTree.preOrder(root4);
        System.out.println();
    }
}