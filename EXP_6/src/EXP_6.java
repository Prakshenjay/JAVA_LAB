// 6.	Write a C++ program to define a base class bank, which holds various details of customers such as name, account number, balance and member functions to read, display and an abstract method to calculate rate of interest earned by all the account holders. Derive three classes namely City-Bank, SBI-bank, Canara-bank from this base class, which are offering different rate of interests. Extend the calculate method of base class with in these derived classes to calculate and display the interest earned by all the account holders of these banks.

import java.util.Scanner;

public class EXP_6 {

    public static class Bank
    {
        public String Name;
        public int AccNo;
        public double Balance;
        public double Interest;

        public void read(Scanner sc)
        {
            System.out.println("======= Enter Information ========");

            System.out.println("Enter Name : ");
            this.Name = sc.nextLine();

            System.out.println("Enter Account Number : ");
            this.AccNo = sc.nextInt();

            System.out.println("Enter Balance : ");
            this.Balance= sc.nextDouble();
        }

        public void printdetails()
        {
            System.out.println("======= Customer Information ========");
            System.out.println("Name : " + this.Name);
            System.out.println("Account Number : " + this.AccNo);
            System.out.println("Balance : " + this.Balance);
        }
    }

    public static class City_Bank extends Bank
    {
        public double Rate = 0.15;

        public void read(Scanner sc)
        {
            super.read(sc);
            Interest = Rate * Balance;
        }

        public void printdetails()
        {
            super.printdetails();
            System.out.println("Interest : " + this.Interest);
        }
    }

    public static class SBI_Bank extends Bank
    {
        public double Rate = 0.09;

        public void read(Scanner sc)
        {
            super.read(sc);
            Interest = Rate * Balance;
        }

        public void printdetails()
        {
            super.printdetails();
            System.out.println("Interest : " + this.Interest);
        }
    }

    public static class Canara_Bank extends Bank
    {
        public double Rate = 0.05;

        public void read(Scanner sc)
        {
            super.read(sc);
            Interest = Rate * Balance;
        }

        public void printdetails()
        {
            super.printdetails();
            System.out.println("Interest : " + this.Interest);
        }
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        City_Bank CIB = new City_Bank();
        CIB.read(sc);
        CIB.printdetails();

        SBI_Bank SB = new SBI_Bank();
        SB.read(sc);
        SB.printdetails();

        Canara_Bank CB = new Canara_Bank();
        CB.read(sc);
        CB.printdetails();
    }
}
