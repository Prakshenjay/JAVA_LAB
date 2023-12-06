// Write a java program to define a base class called person which stores information about a person such as name, age, gender. Derive two new classes employee and student from person class to read and display the details that are specefic to student and employee. Demonstrate the above sceanario to read and display atleast 5 students and 5 employees. 

import java.util.Scanner;

public class PersonInheritance {
    static class Person{
        public String Name;
        public int Age;
        public char Gender;

        public Person(String name, int age, char gender){
            this.Name = name;
            this.Age = age;
            this.Gender = gender;
        }
        public void printDetails() {
            System.out.println("\nName: " + this.Name);
            System.out.println("\nAge: " + this.Age);
            System.out.println("\nGender: " + this.Gender);
        }
    }

    static class Student extends Person {
        public String USN;
        public int Grade;
        public float CGPA;

        public Student(String name, int age, char gender, String usn, int grade, float CGPA) {
            super(name, age, gender);
            this.USN = usn;
            this.Grade = grade;
            this.CGPA = CGPA;
        }

        public void printDetails() {
            System.out.println("\n-------------------Student Details-------------------\n");
            super.printDetails();
            System.out.println("\nStudent USN: " + this.USN);
            System.out.println("\nStudent Grade: " + this.Grade);
            System.out.println("\nStudent CGPA: " + this.CGPA);
        }

    }

    static class Employee extends Person {
        public int ID;
        public double Salary;
        public String Department;
        public String Designation;

        public Employee(String name, int age, char gender, int id, double salary, String dpt, String des) {
            super(name, age, gender);
            this.ID = id;
            this.Salary = salary;
            this.Department = dpt;
            this.Designation = des;
        }

        public void printDetails() {
            System.out.println("\n-------------------Employee Details-------------------\n");
            super.printDetails();
            System.out.println("\nEmployee ID: " + this.ID);
            System.out.println("\nEmployee Salary: " + this.Salary);
            System.out.println("\nEmployee Department: " + this.Department);
            System.out.println("\nEmployee Designation: " + this.Designation);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = 2;

        Student std[] = new Student[n];

        Employee emp[] = new Employee[n];

        System.out.println("Enter Student Details : ");
        for(int i = 0 ; i < n ; i++) {

            System.out.print("\nName : ");
            String x = scn.nextLine();

            System.out.print("\nAge : ");
            int y = scn.nextInt();

            System.out.print("\nGender : ");
            char z = scn.next().charAt(0);
            scn.nextLine();

            System.out.print("\nUSN : ");
            String a = scn.nextLine();

            System.out.print("\nGrade : ");
            int b = scn.nextInt();

            System.out.print("\nCGPA : ");
            float c = scn.nextFloat();
            scn.nextLine();

            std[i] = new Student(x,y,z,a,b,c);
        }

        System.out.println("Enter Employee Details : ");
        for(int i = 0 ; i < n ; i++) {

            System.out.print("\nName : ");
            String x = scn.nextLine();

            System.out.print("\nAge : ");
            int y = scn.nextInt();

            System.out.print("\nGender : ");
            char z = scn.next().charAt(0);

            System.out.print("\nEmployee ID : ");
            int a = scn.nextInt();

            System.out.print("\nSalary : ");
            double b = scn.nextDouble();
            scn.nextLine();

            System.out.print("\nDepartment : ");
            String c = scn.nextLine();

            System.out.print("\nDesignation : ");
            String d = scn.nextLine();

            emp[i] = new Employee(x,y,z,a,b,c,d);
        }

        for(int i = 0 ; i < n ; i++) {
            std[i].printDetails();
        }

        for(int i = 0 ; i < n ; i++) {
            emp[i].printDetails();
        }

        System.out.print("Enter Grade to check for highest CGPA : ");
        int gd = scn.nextInt();
        float highest = 0;
        for(int i = 0 ; i < n ; i++) {
            if(std[i].Grade == gd) {
                if(std[i].CGPA > highest) {
                    highest = std[i].CGPA;
                }
            }
        }
        System.out.println("Highest CGPA : " + highest);

        double highest1 = 0;
        for(int i = 0 ; i < n ; i++) {
            if(emp[i].Designation.compareTo("Manager") == 0) {
                if(emp[i].Salary > highest1) {
                    highest1 = emp[i].Salary;
                }
            }
        }
        System.out.println("Highest Salary for a Manager : " + highest1);

        scn.close();

    }
}
