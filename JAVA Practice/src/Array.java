import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter length of First Array : ");
        int num1 = scn.nextInt();

        int[] array1 = new int[num1];
        for(int i = 0 ; i < num1 ; i++) {
            array1[i] = scn.nextInt();
        }

        System.out.print("Enter length of Second Array : ");
        int num2 = scn.nextInt();

        int[] array2 = new int[num1];
        for(int i = 0 ; i < num2 ; i++) {
            array2[i] = scn.nextInt();
        }

        scn.close();

        if(array1.length != array2.length) {
            System.out.println("Arrays must have the same length");
            return;
        }

        int[] result = new int[array1.length];

        for (int i = 0 ; i < array1.length ; i++) {
            result[i] = array1[i] * array2[i];
        }

        System.out.print("Result of array multiplication : ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
