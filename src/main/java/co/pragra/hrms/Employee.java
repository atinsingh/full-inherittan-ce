package co.pragra.hrms;

import co.pragra.base.Person;

import java.util.Scanner;

public class Employee extends Person {
    private int empId;
    private double hourlyRate;

    public Employee(String name, String address, int empId, double hourlyRate) {
        super(name, address);
        this.empId = empId;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        Scanner scanner = new Scanner(System.in);

        return hourlyRate*8*21;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", hourlyRate=" + hourlyRate +
                ", Salary=" + calculateSalary()+
                '}';
    }
}
