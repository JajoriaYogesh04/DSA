public class ConstructorChaining {
    public static void main(String args[]){
        B b1= new B();
        // B b2= new B(1);
    }
}
class A{
    A(){
        System.out.println("Constructor A1");
    }
}
class B extends A{
    B(){
        this(4);
        System.out.println("Constructor B1");
    }
    B(int n){
        System.out.println("Constructor B2");
    }
}