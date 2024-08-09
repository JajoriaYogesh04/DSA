import java.util.*;
public class ShortestPath {
    public static void shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Path: ");
        String path= sc.next();
        shortestPath(path);
    }
}