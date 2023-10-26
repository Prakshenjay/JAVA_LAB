import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int size;
        System.out.print("Enter Size of Matrix : ");
        size = scn.nextInt();

        int[][] matrix1 = new int[size][size];
        System.out.print("Enter elements of First Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                matrix1[i][j] = scn.nextInt();
            }
        }

        int[][] matrix2 = new int[size][size];
        System.out.print("Enter elements of Second Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                matrix2[i][j] = scn.nextInt();
            }
        }

        System.out.println("First Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                System.out.print(" " + matrix1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Second Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                System.out.print(" " + matrix2[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[][] result_matrix = new int[size][size];
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                result_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Summation Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                System.out.print(" " + result_matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                result_matrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("Product Matrix : ");
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                System.out.print(" " + result_matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        int diagnol_sum = 0;
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(i == j) {
                    diagnol_sum += result_matrix[i][j];
                }
            }
        }
        System.out.println("Diagnol Sum of Matrix : " + diagnol_sum);

        scn.close();
    }
}
