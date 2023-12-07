import java.util.Scanner;

public class Employee {
    static class Emp
    {                
        public
                String Name;
                int ID;
                double Salary;
                String Department;
                String Designaion;

                void getdata(String x, int y, double z, String d, String e)
                {
                    Name = x;
                    ID = y;
                    Salary = z;
                    Department = d;
                    Designaion = e;
                }

                void printdata()
                {
                    System.out.println("\n============Employee Information============\n");
                    System.out.println("Name : " + Name + "\n");
                    System.out.println("Employee ID : " + ID + "\n");
                    System.out.println("Salary : " + Salary + "\n");
                    System.out.println("Department : " + Department + "\n");
                    System.out.println("Designaion : " + Designaion + "\n");
                }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 4;

        Emp E[] = new Emp[n];

        // EMPLOYEE INPUT

        for(int i = 0 ; i < n ; i++) {
            E[i] = new Emp();

            System.out.println("\nEnter Employee Information : \n");

            System.out.print("Name : ");
            String x = sc.nextLine();

            System.out.print("Employee ID : ");
            int y = sc.nextInt();

            System.out.print("Salary : ");
            double z = sc.nextDouble();

            sc.nextLine();

            System.out.print("Department : ");
            String d = sc.nextLine();

            System.out.print("Designation : ");
            String e = sc.nextLine();

            E[i].getdata(x, y, z, d, e);
        }

        // EMPLOYEE PRINT

        for(int i = 0 ; i < n ; i++) {
            E[i].printdata();
        }

        // DEPARTMENT SALARY SUM

        System.out.print("Enter Department for Salary Summation : ");
        String dpt = sc.nextLine();

        double total = 0;

        for(int i = 0 ; i < n ; i++) {
            if(dpt.compareTo(E[i].Department) == 0) {
                total += E[i].Salary;
            }
        }

        System.out.println("Department Total Salary : " + total + "\n");

        // DESIGNATION HIGHEST SALARY

        System.out.print("Enter Designation for Highest Salary : ");
        String des = sc.nextLine();

        double Highest = 0;

        for(int i = 0 ; i < n ; i++) {
            if(des.compareTo(E[i].Designaion) == 0) {
                if (Highest < E[i].Salary ) {
                    Highest = E[i].Salary;
                }
            }
        }

        System.out.println("Designation Highest Salary : " + Highest + "\n");

        // DEPARTMENT SALARY HIKE

        System.out.print("Enter Department for Salary Hike : ");
        dpt = sc.nextLine();

        System.out.print("Enter Hike Percentage: ");
        double hike = sc.nextDouble();

        for(int i = 0 ; i < n ; i++) {
            if(dpt.compareTo(E[i].Department) == 0) {
                E[i].Salary *= hike/100;
            }
        }

        for(int i = 0 ; i < n ; i++) {
            E[i].printdata();
        }
        
        sc.close();
    }   
}
