public class Polymorphism {
    public static void main(String args[]){
        // Calculator calc= new Calculator();               //Method Overoading
        // System.out.println(calc.sum(2,5));
        // System.out.println(calc.sum((float)2.2,(float)5.6));
        // System.out.println(calc.sum(2,5, 7));

        Dear d1= new Dear();                                //Method Overriding
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}