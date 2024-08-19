public class Inheritance {
    public static void main(String args[]){
        // Fish shark= new Fish();
        // System.out.println(shark.fins);
        // shark.eat();

        Dog dobby= new Dog();
        dobby.breath();
        dobby.legs= 2;
        System.out.println(dobby.legs);
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