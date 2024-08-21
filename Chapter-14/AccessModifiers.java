public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myAC= new BankAccount();
        myAC.username= "krishna";
        System.out.println(myAC.username);
        // myAC.password= "krishna123";
        myAC.setPassword("krishna123");
        // System.out.println(myAC.password);
    }
}
class BankAccount{
    public String username;
    private String password;
    void setPassword(String newPassword){
        password= newPassword;


        
    }
}   