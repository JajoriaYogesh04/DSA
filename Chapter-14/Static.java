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
    }
}

class Student{
    String name;
    int roll;
    static String school;
    static int percentage(int a, int b, int c){
        return (a+b+c)/3;
    }
}
