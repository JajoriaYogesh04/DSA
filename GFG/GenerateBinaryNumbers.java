

class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> list= new ArrayList<>();
        Queue<String> q= new LinkedList<>();
        q.add("1");
        for(int i=0; i<n; i++){
            String top= q.remove();
            list.add(top);
            q.add(top+"0");
            q.add(top+"1");
        }
        return list;
    }
}