public class Inheritance {
    public static void main(String args[]){
        // Fish shark= new Fish();          //Single Level
        // System.out.println(shark.fins);
        // shark.eat();

        // Dog dobby= new Dog();               //Multilevel
        // dobby.breath();
        // dobby.legs= 2;
        // System.out.println(dobby.legs);

        // Fish f1= new Fish();                    //Hierarchical 
        // Bird b1= new Bird();
        // Mammal m1= new Mammal();
        // f1.eat();
        // b1.eat();
        // m1.eat();

        Shark s1= new Shark();                      //Hybrid Ineritance
        s1.shark();
        Peacock p1= new Peacock();
        p1.peacock();
        Human h1= new Human();
        h1.human();
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
class Cat extends Mammal{
    void cat(){
        System.out.println("Cat");
    }
}
class Human extends Mammal{
    void human(){
        System.out.println("Human");
    }
}
class Fish extends Animal{
    int fins= 2;
    void swim(){
        System.out.println("Swims");
    }
}
class Shark extends Fish{
    void shark(){
        System.out.println("Shark");
    }
}
class Tuna extends Fish{
    void tuna(){
        System.out.println("Tuna");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Peacock extends Bird{
    void peacock(){
        System.out.println("Peacock");
    }
}