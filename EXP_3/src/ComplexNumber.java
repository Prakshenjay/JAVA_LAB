// 3.	Write a Java program using encapsulation and constructors to create a class to represent a complex number and perform the following perations: 
//      a.	Addition of two complex numbers
//      b.	Subtraction of two complex numbers
//      c.	Compare two complex numbers.

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public void display() {
        System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = sc.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = sc.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);
        ComplexNumber difference = complex1.subtract(complex2);
        boolean isEqual = complex1.isEqual(complex2);

        System.out.println("\nResults:");
        complex1.display();
        complex2.display();
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        difference.display();
        System.out.println("Complex numbers are equal: " + isEqual);

        sc.close();
    }
}
