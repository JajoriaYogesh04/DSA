import java.util.*;
public class MergeTwoBST{
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
    public static void getInorder(Node root,ArrayList<Integer>list){
        if(root==null)return;
        getInorder(root.left,list);
        list.add(root.data);
        getInorder(root.right,list);
    }
    public static ArrayList<Integer> mergeTwoArrayList(ArrayList<Integer>list1,ArrayList<Integer>list2){
        ArrayList<Integer>list3=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }
            else{
                list3.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            list3.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            list3.add(list2.get(j));
            j++;
        }
        return list3;
    }
    public static Node createBST(ArrayList<Integer>list,int si,int ei){
        if(si>ei)return null;
        int mid=si+(ei-si)/2;
        Node newNode=new Node(list.get(mid));
        newNode.left=createBST(list,si,mid-1);
        newNode.right=createBST(list,mid+1,ei);
        return newNode;
    }
    public static Node mergeTwoBST(Node root1,Node root2){
        if(root1==null&&root2==null)return null;
        else if(root1==null)return root2;
        else if(root2==null)return root1;
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        getInorder(root1,list1);
        getInorder(root2,list2);
        ArrayList<Integer>list3=mergeTwoArrayList(list1,list2);
        Node root3=createBST(list3,0,list3.size()-1);
        return root3;
    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        // Test Case 1: Basic merge
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        System.out.println("Test Case 1: Merge two basic BSTs");
        Node merge1 = mergeTwoBST(root1, root2);
        preOrder(merge1);
        System.out.println();

        // Test Case 2: One tree is empty
        System.out.println("Test Case 2: One tree is empty");
        Node merge2 = mergeTwoBST(null, root2);
        preOrder(merge2);
        System.out.println();

        // Test Case 3: Both trees are empty
        System.out.println("Test Case 3: Both trees are empty");
        Node merge3 = mergeTwoBST(null, null);
        preOrder(merge3);
        System.out.println();

        // Test Case 4: Trees with duplicate elements
        Node root3 = new Node(5);
        root3.left = new Node(3);
        root3.right = new Node(7);
        root3.left.left = new Node(2);
        root3.left.right = new Node(4);

        Node root4 = new Node(6);
        root4.left = new Node(5);
        root4.right = new Node(8);

        System.out.println("Test Case 4: Trees with duplicate elements");
        Node merge4 = mergeTwoBST(root3, root4);
        preOrder(merge4);
        System.out.println();

        // Test Case 5: Large tree
        Node root5 = new Node(10);
        root5.left = new Node(5);
        root5.right = new Node(15);
        root5.left.left = new Node(3);
        root5.left.right = new Node(7);
        root5.right.left = new Node(13);
        root5.right.right = new Node(17);

        System.out.println("Test Case 5: Large tree");
        Node merge5 = mergeTwoBST(root1, root5);
        preOrder(merge5);
        System.out.println();
    }
}