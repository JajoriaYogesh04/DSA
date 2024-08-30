public class PracticeQuestion5 {
    public static void towerOfHanot(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Shift the "+n+"th disk from "+src+" to "+dest);
            return;
        }
        towerOfHanot(n-1, src, dest, help);
        System.out.println("Shift the "+n+"th disk from "+src+" to "+dest);
        towerOfHanot(n-1, help, src, dest);

    }
    public static void main(String args[]){
        int n= 3;
        String a= "A";
        String b= "B";
        String c= "C";
        towerOfHanot(n, a, b, c);
    }
}