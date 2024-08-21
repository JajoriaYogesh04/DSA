import java.util.*;
public class PracticeQuestion1 {
    public static Complex add(Complex c1, Complex c2){
        // System.out.println("("+c1.real+" + i"+c1.img+")"+" + "+"("+c2.real+" + i"+c2.img+")"+" = "+(c1.real + c2.real)+" + i"+(c1.img + c2.img));
        return new Complex(c1.real + c2.real, c1.img + c2.img);
    }
    public static Complex sub(Complex c1, Complex c2){
        // System.out.println("("+c1.real+" + i"+c1.img+")"+" - "+"("+c2.real+" + i"+c2.img+")"+" = "+(c1.real - c2.real)+" + i"+(c1.img - c2.img));
        return new Complex(c1.real - c2.real, c1.img - c2.img);
    }
    public static Complex mul(Complex c1, Complex c2){
        // System.out.println("("+c1.real+" + i"+c1.img+")"+" x "+"("+c2.real+" + i"+c2.img+")"+" = "+((c1.real * c2.real) - (c1.img * c2.img))+" + i"+((c1.real * c2.img) + (c1.img * c2.real)));
        return new Complex(((c1.real * c2.real) - (c1.img * c2.img)), ((c1.real * c2.img) + (c1.img * c2.real)));
    }
    public static void printComplex(Complex c){
        // System.out.println(c.real+" + i"+c.img);
        if(c.real==0){
            System.out.println(c.img+"i");
        }
        else if(c.img==0){
            System.out.println(c.real);
        }
        else if(c.img<0){
            System.out.println(c.real+" "+c.img+"i");
        }
        else{
            System.out.println(c.real+" + "+c.img+"i");
        }
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
        Complex addition= add(c1, c2);
        printComplex(addition);
        Complex subtraction= sub(c1, c2);
        printComplex(subtraction);
        Complex multiplication= mul(c1, c2);
        printComplex(multiplication);
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