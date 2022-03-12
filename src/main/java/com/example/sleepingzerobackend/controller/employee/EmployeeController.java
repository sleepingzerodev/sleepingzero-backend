package com.example.sleepingzerobackend.controller.employee;

import com.example.sleepingzerobackend.model.employee.Employee;
import com.example.sleepingzerobackend.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployeeByEmpId/{emp_id}")
    public List<Employee> getEmployee(@PathVariable("emp_id") long empId) {
        System.out.println("empId = " + empId);
        return employeeService.getEmployeeById(empId);
    }



}
