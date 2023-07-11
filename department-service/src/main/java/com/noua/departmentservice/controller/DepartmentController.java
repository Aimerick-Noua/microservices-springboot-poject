package com.noua.departmentservice.controller;

import com.noua.departmentservice.client.EmployeeClient;
import com.noua.departmentservice.model.Department;
import com.noua.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;

    @Autowired
    private EmployeeClient employeeClient;

    @GetMapping
    public List<Department> getAllDepartments(){
        return repository.findAll();
    }

    @GetMapping("/with-employees")
    public List<Department> getAllDeptWithEmployees(){
        List<Department> departments = repository.findAll();
        departments.forEach(department -> department.setEmployees(employeeClient.findByDepartment(department.getId())));
        return departments;
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id){
        return repository.findDepartmentById(id);
    }

    @PostMapping
    public void addDepartment(@RequestBody Department department){
        repository.addDepartment(department);
    }
}
