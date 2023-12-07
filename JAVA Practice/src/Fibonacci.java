// Write a java program to find the fibonacci series using recursive and non recursive functions

public class Fibonacci {
    
    static int fib1(int x){

        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        else{
            return fib1(x - 1) + fib1(x - 2);
        }
    }

    static int fib2(int x){

        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        else{
            int[] arr = new int[x+1];

            arr[0] = 0;
            arr[1] = 1;

            for(int i = 2; i <= x; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }

            return arr[x];
        }
    }
    public static void main(String[] args){
        int n = 10;

        System.out.println("\nFibonacci series : \n");
        for(int i = 0 ; i < n ; i++){
            System.out.print(" " + fib1(i) + " ");
        }

        System.out.println("\nFibonacci series : \n");
        for(int i = 0 ; i < n ; i++){
            System.out.print(" " + fib2(i) + " ");
        }
    }
}
