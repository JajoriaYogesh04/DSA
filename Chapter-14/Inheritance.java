public class Inheritance {
    public static void main(String args[]){
        Fish f1= new Fish();
        System.out.println(f1.fins);
        f1.eat();
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
class Fish extends Animal{
    int fins= 2;
    void swim(){
        System.out.println("Swims");
    }
}