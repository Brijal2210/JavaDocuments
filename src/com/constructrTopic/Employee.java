package com.constructrTopic;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;

    public Employee(String name, int id, int salary){
        // why  we use constructor:  initialize the variable when someone create object
        employeeName = name;
        employeeId = id;
        employeeSalary = salary;
    }
    public void displayEmployeeData(){
        System.out.println("Employee name: " + employeeName);
        System.out.println("EmployeeId: "+ employeeId);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee employee =  new Employee("Brijal", 3104, 2200);
       employee.displayEmployeeData();

       Employee employee1 = new Employee("swati", 3015, 2500);
      employee1.displayEmployeeData();

    }


}
