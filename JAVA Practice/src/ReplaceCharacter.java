import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = scn.nextLine();

        int len = str.length();

        System.out.print("Enter character to replace : ");
        char x = scn.next().charAt(0);
        System.out.print("Enter new character : ");
        char y = scn.next().charAt(0);

        str.replace(x,y);

        System.out.println("Modified string is : " + str);
        
        scn.close();

        }
    }
