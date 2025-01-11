import java.util.*;
public class FindAllDuplicateSubtrees{
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
        static HashMap<String,Integer>map=new HashMap<>();
        public static Node buildTree(int nodes[]){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static String duplicateSubtrees(Node root,ArrayList<String>res){
            if(root==null){
                return "";
            }
            String str=Integer.toString(root.data)+duplicateSubtrees(root.left,res)+duplicateSubtrees(root.right,res);
            if(map.get(str)!=null&&map.get(str)==1){
                res.add(str);
            }
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
            return str;
        }
        public static void reset() {
            idx = -1;
            map.clear();
        }
    }
    public static void main(String args[]){
        // Test Case 1
        int[] nodes1 = {1, 4, 3, -1, -1, -1, 3, 4, 3, -1, -1, -1, 3, -1, -1};
        BinaryTree.reset();  // Reset before building a new tree
        Node root1 = BinaryTree.buildTree(nodes1);
        ArrayList<String> list1 = new ArrayList<>();
        BinaryTree.duplicateSubtrees(root1, list1);
        System.out.println("Test Case 1: " + list1);

        // Test Case 2
        int[] nodes2 = {1, 2, 3, 4, -1, -1, 2, 4, -1, -1, 4, -1, -1, 3, -1, -1};
        BinaryTree.reset();  // Reset before building a new tree
        Node root2 = BinaryTree.buildTree(nodes2);
        ArrayList<String> list2 = new ArrayList<>();
        BinaryTree.duplicateSubtrees(root2, list2);
        System.out.println("Test Case 2: " + list2);

        // Test Case 3
        int[] nodes3 = {2, 1, -1, -1, 1, 2, -1, -1, 2, -1, -1};
        BinaryTree.reset();  // Reset before building a new tree
        Node root3 = BinaryTree.buildTree(nodes3);
        ArrayList<String> list3 = new ArrayList<>();
        BinaryTree.duplicateSubtrees(root3, list3);
        System.out.println("Test Case 3: " + list3);
    }
}