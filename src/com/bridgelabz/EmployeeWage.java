package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 3);
        int wagePerHr = 20;
        int salary = 0;
        switch (random) {
            case 1 :
                salary = wagePerHr*8;
                break;
            case 2 :
                salary = wagePerHr*4;
                break;
        }
        System.out.println("Employee daily wage is "+salary);
    }
}
