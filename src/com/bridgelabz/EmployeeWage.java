package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int wagePerHr = 20;
        int salary = 0;
        int totalWorkingDays = 20;
        int day = 1;
        int maxWorkingHrs = 100;
        int totalWorkingHrs = 0;
        while (day <= totalWorkingDays && totalWorkingHrs <= maxWorkingHrs) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 1 :
                    salary = salary + wagePerHr*8;
                    totalWorkingHrs = totalWorkingHrs + 8;
                    break;
                case 2 :
                    salary = salary + wagePerHr*4;
                    totalWorkingHrs = totalWorkingHrs + 4;
                    break;
            }
            System.out.println("day :"+day+" Salary :"+salary+" Total Hr :"+totalWorkingHrs);
            day++;
        }
        System.out.println("Employee monthly wage is "+salary);
    }
}
