import java.util.Scanner;

public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single= friendsPairing(n-1);
        int pair= (n-1)*friendsPairing(n-2);
        return single+pair;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Friends Number: ");
        int friends= sc.nextInt();
        System.out.println(friendsPairing(friends));
    }
}