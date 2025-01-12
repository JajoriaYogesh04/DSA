

class Solution {
    public String duplicate(Node root,List<Node>list,HashMap<String,Integer>map){
        if(root==null)return "#";
        String str=Integer.toString(root.data)+","+duplicate(root.left,list,map)+","+duplicate(root.right,list,map);
        if(map.get(str)!=null&&map.get(str)==1)list.add(root);
        if(map.containsKey(str))map.put(str,map.get(str)+1);
        else map.put(str,1);
        return str;
    }
    public List<Node> printAllDups(Node root) {
        // code here
        List<Node>list=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        duplicate(root,list,map);
        return list;
    }
}