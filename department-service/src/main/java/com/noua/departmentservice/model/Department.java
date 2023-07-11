package com.noua.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Data
public class Department {
    private Integer id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
