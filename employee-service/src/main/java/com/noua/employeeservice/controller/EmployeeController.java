package com.noua.employeeservice.controller;

import com.noua.employeeservice.model.Employee;
import com.noua.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeRepository repository;

    @GetMapping
    public List<Employee> getAllDepartments(){
        LOGGER.info("returns all employees");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getDepartmentById(@PathVariable Integer id){
        LOGGER.info("Returns employee with id {}",id);
        return repository.findEmployeeById(id);
    }

    @GetMapping("department/{id}")
    public List<Employee> findByDepartment(@PathVariable Integer id){
        return repository.findByDepartment(id);
    }

    @PostMapping
    public void addDepartment(@RequestBody Employee department){
        repository.addEmployee(department);
    }
}
