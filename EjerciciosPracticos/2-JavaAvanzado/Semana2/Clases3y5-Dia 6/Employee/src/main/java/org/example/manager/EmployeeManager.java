package org.example.manager;

import org.example.model.Employee;

import java.util.*;
import java.util.stream.*;

public class EmployeeManager {
    Employee employee;
    public void init() {

        List<Employee> employees = Arrays.asList(
                new Employee("Pol", 1200.0, "Developer"),
                new Employee("Jaume", 120.0, "Developer"),
                new Employee("Oriol", 12.0, "Analyst"),
                new Employee("Neus", 30000.0, "Analyst"),
                new Employee("Laia", 130000.0, "Manager"));


        List<Employee> salaryStream = employees.stream()
                .filter(p -> p.getSalary() > 1000 )
                .toList();
        System.out.println("employees whose salary is greater than 1000");
        salaryStream.forEach(System.out::println);
        System.out.println( );

        List<Employee> developers = employees.stream()
                .filter(p -> p.getCategory().equals("Developer"))
                .toList();

        List<Employee> analysts = employees.stream()
                .filter(p -> p.getCategory().equals("Analyst"))
                .toList();

        List<Employee> managers = employees.stream()
                .filter(p -> p.getCategory().equals("Manager"))
                .toList();

        double averageSalaryDev = developers.stream()
                .mapToDouble(Employee ::getSalary)
                .average()
                .orElse(0.0);

        double averageSalaryAnalyst = analysts.stream()
                .mapToDouble(Employee ::getSalary)
                .average()
                .orElse(0.0);

        double averageSalaryManagers = managers.stream()
                .mapToDouble(Employee ::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average Salary - Developers -> " + averageSalaryDev);
        System.out.println("Average Salary - Analysts -> " + averageSalaryAnalyst);
        System.out.println("Average Salary - managers -> " + averageSalaryManagers);
        System.out.println( );

        Optional<Employee> maxSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        maxSalary.ifPresent(employee -> System.out.println("The highest paid employee : " + employee));
    }
}
