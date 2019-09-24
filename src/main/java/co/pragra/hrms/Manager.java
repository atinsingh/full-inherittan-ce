package co.pragra.hrms;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String address, int empId, double hourlyRate, double bonus) {
        super(name, address, empId, hourlyRate);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+bonus;
    }


}
