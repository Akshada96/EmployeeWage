package com.bridgelabz;

public class EmployeeWage {
    int wagePerHr, totalWorkingDays, maxWorkingHrs;
    String companyName;
    public EmployeeWage(int wagePerHr, int totalWorkingDays, int maxWorkingHrs, String companyName) {
        this.wagePerHr = wagePerHr;
        this.totalWorkingDays = totalWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
        this.companyName = companyName;
    }
    void computeWage() {
        int salary = 0, day = 1, totalWorkingHrs = 0;
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
//            System.out.println("day :"+day+" Salary :"+salary+" Total Hr :"+totalWorkingHrs);
            day++;
        }
        System.out.println("Employee monthly wage for "+companyName+" company is "+salary);
    }
    public static void main(String[] args) {
        EmployeeWage e1 = new EmployeeWage(20,20,100, "Samsung");
        e1.computeWage();
        EmployeeWage e2 = new EmployeeWage(25,22,95, "Vivo");
        e2.computeWage();
        EmployeeWage e3 = new EmployeeWage(30,24,110, "Oppo");
        e3.computeWage();
    }
}
