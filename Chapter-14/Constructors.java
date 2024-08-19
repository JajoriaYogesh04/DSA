public class Constructors {
    public static void main(String args[]){
        Student s1= new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2= new Student("Sachin");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        Student s3= new Student(135);
        System.out.println(s3.name);
        System.out.println(s3.roll);
        // Student s4= new Student("Sachin", 135);         //Not defined
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("New Student");
    }
    Student(String name){
        this.name= name;
    }
    Student(int roll){
        this.roll= roll;
    }
}