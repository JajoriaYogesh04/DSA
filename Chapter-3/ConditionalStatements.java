
public class ConditionalStatements {
    public static void main(String args[]) {
        int age= 15;
        if (age>=18) {
            System.out.print("ADULT");
        }
        if (age>=13 && age<18) {
            System.out.print("TEENAGER");
        }
        else{
            System.out.print("CHILD");
        }
    }
}