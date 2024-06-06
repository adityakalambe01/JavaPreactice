package oop.encapsulation.employee;

import oop.encapsulation.Address;

public class Employee {
    int employeeId;
    double employeeSalary;
    String employeeName;
    String employeeDepartment;
    String employeeRole;
    Address employeeAddress;

    public Employee() {

    }

    public Employee(int employeeId, double employeeSalary, String employeeName, String employeeDepartment, String employeeRole, Address employeeAddress) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeRole = employeeRole;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}
