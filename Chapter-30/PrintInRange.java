public class PrintInRange{
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
    public static Node buildBST(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data){
            root.left=buildBST(root.left,val);
        }
        else if(val>root.data){
            root.right=buildBST(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null)return;
        if(k1<=root.data && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        }
        else if(k1<root.data){
            printInRange(root.left,k1,k2);
        }
        else if(root.data<k2){
            printInRange(root.right,k1,k2);
        }
        return;
    }
    public static void main(String args[]){
        // Original test case
        int nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildBST(root, nodes[i]);
        }
        System.out.println("In-Order Traversal of BST:");
        inOrder(root);
        System.out.println("\n\nOriginal Range Query (5 to 11):");
        printInRange(root, 5, 11);

        // Additional test cases

        // Test Case 1: Empty Tree
        System.out.println("\nTest Case 1: Empty Tree");
        printInRange(null, 5, 10);  // No output expected

        // Test Case 2: Single Node Tree
        System.out.println("\nTest Case 2: Single Node Tree");
        Node singleNode = new Node(7);
        printInRange(singleNode, 5, 10);  // Expected output: 7

        // Test Case 3: Range Outside BST Values
        System.out.println("\nTest Case 3: Range Outside BST Values");
        printInRange(root, 0, 2);  // Expected output: 1

        // Test Case 4: Exact Range Match
        System.out.println("\nTest Case 4: Exact Range Match");
        printInRange(root, 1, 14);  // Expected output: 1 3 4 5 6 8 10 11 14

        // Test Case 5: Sub-range
        System.out.println("\nTest Case 5: Sub-range");
        printInRange(root, 6, 10);  // Expected output: 6 8 10

        // Test Case 6: Negative and Positive Values
        System.out.println("\nTest Case 6: Negative and Positive Values");
        int mixedNodes[] = {-10, -3, 0, 5, 9};
        Node mixedRoot = null;
        for (int value : mixedNodes) {
            mixedRoot = buildBST(mixedRoot, value);
        }
        printInRange(mixedRoot, -3, 5);  // Expected output: -3 0 5
    }
}