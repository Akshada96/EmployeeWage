package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 2);
        int wagePerHr = 20;
        int salary = 0;
        if (random == 1) {
            salary = 20*8;
        }
        System.out.println("Employee daily wage is "+salary);
    }
}
