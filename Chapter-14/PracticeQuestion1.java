import java.util.*;
public class PracticeQuestion1 {
    public static void add(Complex c1, Complex c2){
        System.out.println("("+c1.real+" + i"+c1.img+")"+" + "+"("+c2.real+" + i"+c2.img+")"+" = "+(c1.real + c2.real)+" + i"+(c1.img + c2.img));
    }
    public static void sub(Complex c1, Complex c2){
        System.out.println("("+c1.real+" + i"+c1.img+")"+" - "+"("+c2.real+" + i"+c2.img+")"+" = "+(c1.real - c2.real)+" + i"+(c1.img - c2.img));
    }
    public static void mul(Complex c1, Complex c2){
        System.out.println("("+c1.real+" + i"+c1.img+")"+" x "+"("+c2.real+" + i"+c2.img+")"+" = "+((c1.real * c2.real) - (c1.img * c2.img))+" + i"+((c1.real * c2.img) + (c1.img * c2.real)));
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Real Part of first number: ");
        int real1= sc.nextInt();
        System.out.print("Enter Imaginary Part of first number: ");
        int img1= sc.nextInt();
        Complex c1= new Complex(real1, img1);
        System.out.print("Enter Real Part of second number: ");
        int real2= sc.nextInt();
        System.out.print("Enter Imaginary Part of second number: ");
        int img2= sc.nextInt();
        Complex c2= new Complex(real2, img2);
        add(c1, c2);
        sub(c1, c2);
        mul(c1, c2);
    }
}
class Complex{
    int real;
    int img;
    Complex(int real, int img){
        this.real= real;
        this.img= img;
    }
}