public class Constructors {
    public static void main(String args[]){
        Student s1= new Student();
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        s1.name= "Aryan";
        s1.roll= 1;
        s1.password= "Aryan123";
        s1.marks[0]= 99;
        s1.marks[1]= 98;
        s1.marks[2]= 97;
        Student s5= new Student(s1);
        // s5.password= "123Aryan";
        System.out.println(s5.name);
        System.out.println(s5.roll);
        System.out.println(s5.password);
        s1.marks[0]= 50;
        for(int i=0; i<3; i++){
            System.out.println(s5.marks[i]);
        }
        

        Student s2= new Student("Sachin");
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        Student s3= new Student(135);
        // System.out.println(s3.name);
        // System.out.println(s3.roll);
        // Student s4= new Student("Sachin", 135);         //Not defined
        
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks= new int[3];
        System.out.println("New Student");
    }
    Student(String name){
        marks= new int[3];
        this.name= name;
    }
    Student(int roll){
        marks= new int[3];
        this.roll= roll;
    }
    Student(Student s1){
        marks= new int[3];
        this.name= s1.name;
        this.roll= s1.roll;
        this.marks= s1.marks;
    }
}