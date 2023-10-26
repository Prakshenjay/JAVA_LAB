import java.util.Scanner;

public class BreakString {
    
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        String input;
        System.out.println("Enter a String : ");
        input = scn.nextLine();

        int len = input.length();

        System.out.print("Characters : ");

        for(int i = 0 ; i < len ; i++) {
            char ch = input.charAt(i);
            System.out.print(" " +  ch + " ");
        }

        scn.close();
    }
}
