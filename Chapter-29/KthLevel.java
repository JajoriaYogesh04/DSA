import java.util.*;
public class KthLevel{
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
    static class BinryTree{
        static int idx= -1;
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
        public static void kthLevelRec(Node root, int k, int level){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            kthLevelRec(root.left, k, level+1);
            kthLevelRec(root.right, k, level+1);
        }

        public static void kthLevelItr(Node root, int k){
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            int level=1;
            while(!q.isEmpty()){
                Node top= q.remove();
                if(top==null){
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(null);
                    level++;
                    if(level>k){
                        break;
                    }
                    continue;
                } 
                if(level==k){
                    System.out.print(top.data+" ");
                }
                if(top.left!=null){
                    q.add(top.left);
                }
                if(top.right!=null){
                    q.add(top.right);
                }
            }
        }
    }
    public static void main(String args[]){
        // Test case 1: Example tree
        System.out.println("Test Case 1:");
        BinryTree.idx = -1; // Reset index
        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root1 = BinryTree.buildTree(nodes1);
        int k1 = 2;
        BinryTree.kthLevelRec(root1, k1, 1); // Expected Output: 2 3
        System.out.println();
        BinryTree.kthLevelItr(root1, k1); // Expected Output: 2 3
        System.out.println();

        // Test case 2: Tree with single node
        System.out.println("Test Case 2:");
        BinryTree.idx = -1; // Reset index
        int nodes2[] = {1, -1, -1};
        Node root2 = BinryTree.buildTree(nodes2);
        int k2 = 1;
        BinryTree.kthLevelRec(root2, k2, 1); // Expected Output: 1
        System.out.println();
        BinryTree.kthLevelItr(root2, k2); // Expected Output: 1
        System.out.println();

        // Test case 3: Larger tree
        System.out.println("Test Case 3:");
        BinryTree.idx = -1; // Reset index
        int nodes3[] = {10, 5, 2, -1, -1, 7, -1, -1, 15, 12, -1, -1, 20, -1, -1};
        Node root3 = BinryTree.buildTree(nodes3);
        int k3 = 3;
        BinryTree.kthLevelRec(root3, k3, 1); // Expected Output: 2 7 12 20
        System.out.println();
        BinryTree.kthLevelItr(root3, k3); // Expected Output: 2 7 12 20
        System.out.println();

        // Test case 4: Non-existent level
        System.out.println("Test Case 4:");
        BinryTree.idx = -1; // Reset index
        int nodes4[] = {1, 2, -1, -1, 3, -1, -1};
        Node root4 = BinryTree.buildTree(nodes4);
        int k4 = 4;
        BinryTree.kthLevelRec(root4, k4, 1); // Expected Output: (no output)
        System.out.println();
        BinryTree.kthLevelItr(root4, k4); // Expected Output: (no output)
        System.out.println();

        // Test case 5: Unbalanced tree
        System.out.println("Test Case 5:");
        BinryTree.idx = -1; // Reset index
        int nodes5[] = {1, 2, 4, -1, -1, -1, 3, -1, 7, -1, -1};
        Node root5 = BinryTree.buildTree(nodes5);
        int k5 = 3;
        BinryTree.kthLevelRec(root5, k5, 1); // Expected Output: 4 7
        System.out.println();
        BinryTree.kthLevelItr(root5, k5); // Expected Output: 4 7
        System.out.println();
    }
}