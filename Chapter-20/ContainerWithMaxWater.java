import java.util.ArrayList;
public class ContainerWithMaxWater {
    public static int minimum(int a, int b){
        if(a<=b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int containerWithMaxWater(ArrayList<Integer> height){
        int volume= Integer.MIN_VALUE;
        for(int i=0; i<height.size()-1; i++){
            for(int j=2; j<height.size(); j++){
                int start= height.get(i);
                int end= height.get(j);
                int vol= (j-i)*minimum(start, end)*1;
                if(vol>volume){
                    volume= vol;
                }
            }
        }
        return volume;
    }
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(containerWithMaxWater(height));
    }
}