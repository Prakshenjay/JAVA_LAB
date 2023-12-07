// Write a java program that prints all real solutions to the quadratic equation ax^2 + bx + c = 0
// take a,b,c from the users

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){

    Scanner scn = new Scanner(System.in);

    int a, b, c;

    System.out.println("Enter quadratic equation ax^2 + bx + c");

    System.out.println("Enter a : ");
    a = scn.nextInt();
    System.out.println("Enter b : ");
    b = scn.nextInt();
    System.out.println("Enter c : ");
    c = scn.nextInt();

    double d = b*b - 4*a*c;

    if(d > 0.0)
    {
        double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
        System.out.println("The roots are " + r1 + " and " + r2);
    }else if(d == 0.0)
    {
        double r1 = -b / (2.0 * a);
        System.out.println("The root is " + r1);
    }else
    {
        System.out.println("Roots are not real.");
    }

    scn.close();
}
}
