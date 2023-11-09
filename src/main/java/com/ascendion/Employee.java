//package com.ascendion;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class Employee {
//
//    private String firstName;
//    private String lastName;
//    private double salary;
//    private int Id;
//
//    public Employee(int Id, String firstName, String lastName, double salary){
//        this.Id=Id;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.salary=salary;
//    }
//
//    public double getSalary(){
//        return salary;
//    }
//
//    public static void main(String[] args) {
//        List<Employee> employee = Arrays.asList("Elamaran","Selvam","5000","1");
//
//        employee.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
//
//        if(employee.size()>=3){
//            Employee thirdHighest = employee.get(2);
//
//
//        }
//        /*
//        1,qqq,www,100000
//        2,eee,rrr,90000
//        4,ttt,,80000
//        5,aaa,yyy,80000
//        9,bbb,,80000
//        11,rrr,www,70000
//         */
//
//        Map<Double, List<Employee>> salaryGroup = employee.stream()
//                .collect(Collectors.groupingBy(Employee::getSalary));
//
//        SELECT EMPLOYEE_NAME, SALARY FROM EMPLOYEES
//                ORDER BY SALARY DESC LIMIT 1 OFFSET 2
//
//
//        List<Employee> thirdEmployeesHighest = employee.stream()
//                .map(Employee::getSalary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//
//
//        thirdEmployeesHighest.forEach(System.out::println(Employee::getName));
//    }
//}
