import java.util.Scanner;
class Complex {
    double real, img;
   // Constructor for default complex number
    Complex() {
        real = 0;
        img = 0;
    }
// Constructor for initializing complex number with real and imaginary parts
    Complex(double r, double i) {
        real = r;
        img = i;
    }
  // Method to add two complex numbers
    Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.img = c1.img + c2.img;
        return result;
    }
    // Method to add complex number with an integer
    Complex add(Complex c1, int x) {
        Complex result = new Complex();
        result.real = c1.real + x;
        result.img = c1.img;
        return result;
    }
    // Method to display the complex number
    void display() {
        if (img >= 0) {
            System.out.println("Complex No: " + real + " + " + img + "i");
        } else {
            System.out.println("Complex No: " + real + " - " + (-img) + "i");
        }
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex();  // Default complex number
        Complex c2 = new Complex(4, 6);  // Complex number with values (4, 6)
        Complex c3 = new Complex(6, 8);  // Complex number with values (6, 8)
        System.out.println("Displaying complex numbers one by one:");
        System.out.println("Initial Complex c1:");
        c1.display();  // Display default complex number
        System.out.println("Complex c2:");
        c2.display();  // Display c2
         System.out.println("Complex c3:");
        c3.display();  // Display c3
        c1 = c1.add(c2, c3);  // Add c2 and c3 and store in c1
        System.out.println("After adding c2 and c3, new c1:");
        c1.display();  // Display the result of addition
        c1 = c1.add(c2, 4);  // Add c2 and integer 4 and store in c1
        System.out.println("After adding c2 and 4, new c1:");
        c1.display();  // Display the result
    }
}
