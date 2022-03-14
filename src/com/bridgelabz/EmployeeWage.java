package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 3);
        int wagePerHr = 20;
        int salary = 0;
        if (random == 1) {
            salary = wagePerHr*8;
        }
        else {
            if (random == 2) {
                salary = wagePerHr*4;
            }
        }
        System.out.println("Employee daily wage is "+salary);
    }
}
