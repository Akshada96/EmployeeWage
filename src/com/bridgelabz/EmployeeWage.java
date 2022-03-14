package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {

        int wagePerHr = 20;
        int salary = 0;
        int totalWorkingDays = 20;
        int day = 1;
        while (day <= totalWorkingDays) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 1 :
                    salary = salary + wagePerHr*8;
                    break;
                case 2 :
                    salary = salary + wagePerHr*4;
                    break;
            }
            //System.out.println("day :"+day+" Salary :"+salary);
            day++;
        }
        System.out.println("Employee monthly wage is "+salary);
    }
}
