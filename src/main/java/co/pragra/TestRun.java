package co.pragra;

import co.pragra.base.Person;
import co.pragra.base.RectangleArea;
import co.pragra.hrms.Employee;
import co.pragra.hrms.Manager;

public class TestRun {
    public static void main(String[] args) {
        Person p1 = new Person("Abc","DEF");
        Person emp = new Employee("John","Brampton",1,50);
        Person manager = new Manager("Jean","Mississaga",2,50,1000);
        System.out.println(p1.toString());
        System.out.println(emp.toString());
        System.out.println(manager.toString());

        RectangleArea area  = new RectangleArea();
        area.input();
        System.out.println(area.area());
        area.display();
    }
}
