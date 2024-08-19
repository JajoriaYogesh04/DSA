public class Abstraction {
    public static void main(String args[]){
        Horse h1= new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        h1.changeColor();
        System.out.println(h1.color);

        Chicken c1= new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.color);
        c1.changeColor();
        System.out.println(c1.color);

        // Animal a1= new Animal();

        Mustang m1= new Mustang();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor");
        color= "brown";
    }
    void eat(){
        System.out.println("Eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor");
    }
    void changeColor(){
        color= "black";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color= "yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}