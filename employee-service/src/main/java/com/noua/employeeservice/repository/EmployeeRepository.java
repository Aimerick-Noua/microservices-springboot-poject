package com.noua.employeeservice.repository;

import com.noua.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class EmployeeRepository {

    private List<Employee>employees = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }
    public Employee findEmployeeById(Integer id){
        return employees.stream().filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Element not found"));
    }
    public List<Employee> findAll(){
        return employees;
    }

    public List<Employee> findByDepartment(Integer id) {
        return employees.stream().filter(a -> a.getDepartId().equals(id))
              .toList();
    }
}
