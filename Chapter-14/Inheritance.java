public class Inheritance {
    public static void main(String args[]){
        // Fish shark= new Fish();          //Single Level
        // System.out.println(shark.fins);
        // shark.eat();

        // Dog dobby= new Dog();               //Multilevel
        // dobby.breath();
        // dobby.legs= 2;
        // System.out.println(dobby.legs);

        Fish f1= new Fish();
        Bird b1= new Bird();
        Mammal m1= new Mammal();
        f1.eat();
        b1.eat();
        m1.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breats");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
class Fish extends Animal{
    int fins= 2;
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}