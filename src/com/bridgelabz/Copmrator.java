package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    int id;
    String name;
    Float salary;

    public Employee(int id, String name, float salary) {
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Copmrator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(1, "Ram", 25000f));
        list.add(new Employee(2, "Aditya", 25000f));
        list.add(new Employee(4, "Mohan", 2560f));
        list.add(new Employee(5, "Shohan", 26000f));
        list.add(new Employee(8, "Roshan", 28000f));

//        System.out.println("Sorting on the name Basis-");
//      Collections.sort(list,(p1,p2)->{
//        return p1.name.compareTo(p2.name);
//        });
//        for(Employee p:list) {
//            System.out.println("Employee id: " + p.id + ", Name : " + p.name + ", Salary :  " + p.salary);
//        --------------------------------------------------------
        Stream<Employee> filtered_dat = list.stream().filter(E -> E.salary > 20000);

        filtered_dat.forEach(
                Employee -> System.out.println("Employee id: " + Employee.id + ", Name : " + Employee.name + ", Salary :  " + Employee.salary));
//            --------------------------------------------------------------
    }
}