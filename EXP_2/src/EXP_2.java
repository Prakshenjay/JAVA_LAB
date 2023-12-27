// 2.	Write a java program to create an Employee database which stores following information about the Employee: Name, Emp_id, department, age, and designation. Perform the following operations:
//      a.	Read and display the details of at least five Employees.
//      b.	Calculate and display the sum of salary of all the employees of “sales” department.
//      c.	Retrieve the details of “highest paid manager” in the purchase department.

import java.util.Scanner;

public class EXP_2 {

    static class Employee
    {
        public
                String Name;
                int Emp_ID;
                double Salary;
                String Department;
                int Age;
                String Designation;

                void getdata(Scanner sc)
                {
                    System.out.println("\n============ENTER Employee Information============\n");

                    System.out.print("Name : ");
                    Name = sc.nextLine();

                    System.out.print("Employee ID : ");
                    Emp_ID = sc.nextInt();

                    System.out.print("Employee Salary : ");
                    Salary = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Department : ");
                    Department = sc.nextLine();

                    System.out.print("Age : ");
                    Age = sc.nextInt();

                    sc.nextLine();
                    
                    System.out.print("Designaion : ");
                    Designation = sc.nextLine();
                }

                void printdata()
                {
                    System.out.println("\n============Employee Information============\n");
                    System.out.println("Name : " + Name + "\n");
                    System.out.println("Employee ID : " + Emp_ID + "\n");
                    System.out.println("Salary : " + Salary + "\n");
                    System.out.println("Department : " + Department + "\n");
                    System.out.println("Age : " + Age + "\n");
                    System.out.println("Designaion : " + Designation + "\n");
                }
    }

    public static void main(String[] args) throws Exception {

        int n = 2;

        Employee E[] = new Employee[n];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < n ; i++)
        {
            E[i] = new Employee();
            E[i].getdata(sc);
        }

        sc.close();

        for(int i = 0 ; i < n ; i++)
        {
            E[i].printdata();
        }

        double total = 0;
        for(int i = 0 ; i < n ; i++){
            if(E[i].Department.compareTo("Sales") == 0){
                total = total + E[i].Salary;
            }
        }
        System.out.println("Total Salary for Sales Department : " + total);

        double highest = 0;
        for(int i = 0 ; i < n ; i++){
            if(E[i].Department.compareTo("Purchase") == 0){
                if(E[i].Designation.compareTo("Manager") == 0){
                    if(E[i].Salary > highest){
                        highest = E[i].Salary;
                    }
                }
            }
        }
        System.out.println("Highest Paid Manager in Purchase Department : " + highest);
    }
}
