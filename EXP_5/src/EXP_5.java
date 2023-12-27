// 5.	Write a java program using compile time polymorphism (method overloading) to compare two strings.The program should implement two different versions of strcmp the first version of usrstrcmp () that compares two string the second version should compare only specified number of characters from first string with second string and display the results. 

public class EXP_5 {

    public static boolean strcmp(String Str1, String Str2)
    {
        return Str1.equals(Str2);
    }

    public static boolean strcmp(String Str1, String Str2, int num)
    {
        if(Str1.length() < num || Str2.length() < num)
        {
            System.out.println("One of the string is smaller than charcter count");
            return false;
        }

        String subStr1 = Str1.substring(0, num);
        String subStr2 = Str2.substring(0, num);

        return subStr1.equals(subStr2);
    }
    public static void main(String[] args) throws Exception {
        String Str1 = "Hello";
        String Str2 = "Hello World";

        System.out.println("Comparison of Strings : " + strcmp(Str1, Str2));

        int num = 5;

        System.out.println("Comparison of Strings : " + strcmp(Str1, Str2, num));
    }
}
