package com.example.sleepingzerobackend.service.employee;

import com.example.sleepingzerobackend.model.employee.Employee;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {



   private static final List<Employee> lstEmployee = new ArrayList<>();

   //long id, String firstName, String lastName, String email, String qualification, String designation, long phoneNumber, long salary
   @PostConstruct
   public  void addListDetails(){
      lstEmployee.add(new Employee(
              1l,"jitendrasin","jadon","jituj6@gmail.com","sd","engineer",79797997,70));
       lstEmployee.add(new Employee(
               1l,"jay","chwant","jituj6@gmail.com","sd","engineer",79797997,70));

       lstEmployee.add(new Employee(
               1l,"shakti","chwant","jituj6@gmail.com","sd","engineer",79797997,70));

       System.out.println("lstEmployee");
       System.out.println(lstEmployee);
   }


    public List<Employee> getEmployees() {
      return  lstEmployee;
    }

    public void addEmployee(Employee emp) {
        lstEmployee.add(emp);
    }




    public List<Employee> getEmployeeById(long empId) {
            return lstEmployee.stream().filter( e -> e.getId()==empId).collect(Collectors.toList());
    }

}
