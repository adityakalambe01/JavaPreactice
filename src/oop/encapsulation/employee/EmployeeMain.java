package oop.encapsulation.employee;

import oop.encapsulation.Address;

public class EmployeeMain {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("India");
        address.setState("Maharashtra");
        address.setArea("Karve Nagar");
        address.setPinCode(411052);

        Employee employee = new Employee();
        employee.setEmployeeId(123);
        employee.setEmployeeAddress(address);
        employee.setEmployeeDepartment("Computer Science");
        employee.setEmployeeName("Aditya Kalambe");
        employee.setEmployeeRole("Software Engineering");
        employee.setEmployeeSalary(20000);

        System.out.println(employee);
    }

}
