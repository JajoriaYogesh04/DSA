public class Static {
    public static void main(String args[]){
        Student s1= new Student();
        s1.school= "KVS";
        Student s2= new Student();
        System.out.println(s2.school);
        s2.school= "IIT";
        System.out.println(s1.school);
        
        System.out.println(s1.percentage(78, 59, 48));
        System.out.println(s2.percentage(95, 84, 86));

        Horse h1= new Horse();                  //Super
        System.out.println(h1.color);
    }
}

class Student{
    String name;
    int roll;
    void setName(String name){
        this.name= name;
    }
    String getName(){
        return this.name;
    }
    static String school;
    static int percentage(int a, int b, int c){
        return (a+b+c)/3;
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Horse extends Animal{
    Horse(){
        // super();
        super.color= "brown";
        System.out.println("Horse Contructor");
    }
}