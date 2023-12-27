// 8.	Write a java program to read two positive integers and perform the division operation on them and display the result if a user enters a positive integer and non-zero denominator. Else, If the input is negative or the denominator is zero, generate negative number input and divide by zero exception to handle the scenario.

import java.util.Scanner;

public class EXP_8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter a positive numerator:");
            int numerator = sc.nextInt();

            System.out.println("Enter a positive non-zero denominator:");
            int denominator = sc.nextInt();

            if (numerator < 0 || denominator < 0) {
                throw new IllegalArgumentException();
            }

            if(denominator == 0)
            {
                throw new ArithmeticException();
            }

            double result = (double) numerator / denominator;

            System.out.println("Result of division: " + result);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException: Both the numbers should be non-negative");
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
        finally
        {
            System.out.println("Program execution complete.");
            sc.close();
        }
    }
}
