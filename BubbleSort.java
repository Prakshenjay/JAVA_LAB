public class BubbleSort {
    
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

    static void BubbleSort2(String arr[], int n)
    {
        for (int i = 0 ; i < n-1 ; i++) {
            for (int j = 0 ; j < n-i-1 ; j++) {
                if ( arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int array[] = {10,30,5,19,16};
        int n = array.length;

        BubbleSort1(array,n);

        System.out.print("Sorted Array : ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(" " + array[i] + " ");
        }

        System.out.println(" ");

        String array2[] = {"Ram","Rohit","Abhay","Chetak","Prakshenjay","Bhati"};
        int n2 = array2.length;

        BubbleSort2(array2,n2);

        System.out.print("Sorted Array : ");
        for(int i = 0 ; i < n2 ; i++) {
            System.out.print(" " + array2[i] + " ");
        }
    }
}
