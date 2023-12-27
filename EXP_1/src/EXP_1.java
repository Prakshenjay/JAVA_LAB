// 1.	Write a java program:
//      a.	To calculate and display the area of a rectangle.
//      b.	To multiply two arrays and display the result
//      c.	To sort the elements in ascending and descending order using bubble sort algorithm.

import java.util.Scanner;

public class EXP_1 {

    static void BubbleSort1(int arr[], int n)
    {
        for (int i = 0 ; i < n-1 ; i++) {
            for (int j = 0 ; j < n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void BubbleSort2(int arr[], int n)
    {
        for (int i = 0 ; i < n-1 ; i++) {
            for (int j = 0 ; j < n-i-1 ; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle : ");
        double length = sc.nextDouble();

        System.out.println("Enter the width of Rectangle : ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("\nArea is : " + area + "\n");

// ------------------------------------------------------------------------------------

        System.out.print("\nEnter length of Arrays : ");
        int num = sc.nextInt();

        System.out.print("\nEnter elements of First Array : \n");
        int[] array1 = new int[num];
        for(int i = 0 ; i < num ; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("\nEnter elements of Second Array : \n");
        int[] array2 = new int[num];
        for(int i = 0 ; i < num ; i++) {
            array2[i] = sc.nextInt();
        }

        int[] result = new int[num];
        for (int i = 0 ; i < num ; i++) {
            result[i] = array1[i] * array2[i];
        }

        System.out.print("\nResult of array multiplication : \n");
        for (int i = 0 ; i < num ; i++) {
            System.out.print(result[i] + "\t");
        }

// ------------------------------------------------------------------------------------

        System.out.print("\nEnter length of Array : ");
        int len = sc.nextInt();

        System.out.print("\nEnter elements of Array : ");
        int[] array = new int[len];
        for(int i = 0 ; i < len ; i++) {
            array[i] = sc.nextInt();
        }

        BubbleSort1(array,len);

        System.out.print("\nAscending Order Sorted Array : \n");
        for(int i = 0 ; i < len ; i++) {
            System.out.print("\t" + array[i] + "\t");
        }

        BubbleSort2(array,len);

        System.out.print("\nDescending Order Sorted Array : \n");
        for(int i = 0 ; i < len ; i++) {
            System.out.print("\t" + array[i] + "\t");
        }

        sc.close();
    }
}
