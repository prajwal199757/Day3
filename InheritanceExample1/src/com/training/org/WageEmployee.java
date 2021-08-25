package com.training.org;

import java.util.Scanner;

public class WageEmployee extends Employee{
    public String month;
    int year;
    private double noOfWorkingHours;
    private double Wages;
    private double perDaySalary;
    private double perHourSalary;
    int noOfDays;

    public WageEmployee(){}

    public WageEmployee(String month, int year) {
        this.month = month;
        this.year = year;
    }

    public WageEmployee(int empId, String empName, double salary, String month, int year) {
        super(empId, empName, salary);
        this.month = month;
        this.year = year;
        this.noOfWorkingHours=0;
        this.Wages=0;
    }

    public void calculateSalary(){
        int noOfHours=8;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the month");
        month=scan.next();


            if (month.equals("jan")) {
                noOfDays = 31;
            } else if (month.equals("feb")) {
                if((year % 4 == 0) && (year % 100 == 0))
                {
                    noOfDays = 29;
                }
                else {
                    noOfDays = 28;
                }
            } else if (month.equals("mar")) {
                noOfDays = 31;
            } else if (month.equals("apr")) {
                noOfDays = 30;
            } else if (month.equals("may")) {
                noOfDays = 31;
            } else if (month.equals("jun")) {
                noOfDays = 30;
            } else if (month.equals("jul")) {
                noOfDays = 31;
            } else if (month.equals("aug")) {
                noOfDays = 31;
            } else if (month.equals("sep")) {
                noOfDays = 30;
            } else if (month.equals("oct")) {
                noOfDays = 31;
            } else if (month.equals("nov")) {
                noOfDays = 30;
            } else if (month.equals("dec")) {
                noOfDays = 31;
            } else {
                System.out.println("please enter proper month in 'jan,feb...' like that");
            }


        perDaySalary=(getSalary()/noOfDays);
        perHourSalary=perDaySalary/noOfHours;
        Wages=perHourSalary*240;
        System.out.println("the salary of WageEmployee is"+Wages);
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "month='" + month + '\'' +
                ", year=" + year +
                ", noOfWorkingHours=" + noOfWorkingHours +
                ", Wages=" + Wages +
                '}';
    }
}
