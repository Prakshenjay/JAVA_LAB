// 4.	Write a java program to define a base class called person which stores information about a person such as name, age, gender. Derive two new classes employee and student and extend the base class methods in derived class to read and display the details that are specific to student and employee. Display the details of at least five students and five employees.

import java.util.Scanner;

public class EXP_4 {

    static class Person
    {
        public String Name;
        public int Age;
        public int Gender;

        public Person(String x, int y, int z)
        {
            this.Name = x;
            this.Age = y;
            this.Gender = z;
        }

        public void printDetails()
        {
            System.out.println("Name : " + this.Name);
            System.out.println("Age : " + this.Age);
            System.out.println("Gender : " + this.Gender);
        }
    }

    static class Students extends Person
    {
        public int USN;
        public int Attendance;

        public Students(String x, int y, int z, int a, int b)
        {
            super(x,y,z);
            this.USN = a;
            this.Attendance = b;
        }

        public void printDetails()
        {
            System.out.println("=============== Students Details =================");
            super.printDetails();
            System.out.println("USN : " + this.USN);
            System.out.println("Attendance : " + this.Attendance);
        }
    }

    static class Employees extends Person
    {
        public double Salary;
        public String Department;

        public Employees(String x, int y, int z, double a, String b)
        {
            super(x,y,z);
            this.Salary = a;
            this.Department = b;
        }

        public void printDetails()
        {
            System.out.println("=============== Employees Details =================");
            super.printDetails();
            System.out.println("Salary : " + this.Salary);
            System.out.println("Department : " + this.Department);
        }
    }

    public static void main(String[] args) throws Exception {

        int n = 2;

        Students[] S = new Students[n];
        Employees[] E = new Employees[n];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("=========== Enter Information ==========");
            System.out.println("Name : ");
            String x = sc.nextLine();

            System.out.println("Age : ");
            int y = sc.nextInt();

            System.out.println("Gender : ");
            int z = sc.nextInt();

            System.out.println("USN : ");
            int a = sc.nextInt();

            System.out.println("Attendance : ");
            int b = sc.nextInt();

            S[i] = new Students(x, y, z, a, b);
        }

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("=========== Enter Information ==========");
            System.out.println("Name : ");
            String x = sc.nextLine();

            System.out.println("Age : ");
            int y = sc.nextInt();

            System.out.println("Gender : ");
            int z = sc.nextInt();

            System.out.println("Salary : ");
            double a = sc.nextDouble();

            System.out.println("Department : ");
            String b = sc.nextLine();

            E[i] = new Employees(x, y, z, a, b);
        }

        for(int i = 0 ; i < n ; i++)
        {
            S[i].printDetails();
        }

        for(int i = 0 ; i < n ; i++)
        {
            E[i].printDetails();
        }

        sc.close();
    }
}
