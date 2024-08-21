public class PracticeQuestions {
    public static void main(String args[]){
        // Student s= new Student();               //Practice Question 1
        // s.name= "Aryan";
        // System.out.println(s.name);

        Vehicle obj1= new Car();
        obj1.print();
        Vehicle obj2= new Vehicle();
        obj2.print();
    }
}
class Student{
    String name;
    int marks;
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class(Car)");
    }
}