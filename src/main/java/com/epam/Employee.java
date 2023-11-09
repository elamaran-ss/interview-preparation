package com.epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int id;
    String name;
    double salary;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee = "+ "name: "+name+ "id: "+id+ "Salary: "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Elamaran",5000));
        employees.add(new Employee(2,"David",10000));
        employees.add(new Employee(3,"Ajay",250000));
        employees.add(new Employee(4,"Rashwanth",500000));
        employees.add(new Employee(5,"Kishore",5000));

        Comparator<Employee> salaryComparison= Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName);
        employees.sort(salaryComparison);
        employees.forEach(System.out::println);

    }
}
