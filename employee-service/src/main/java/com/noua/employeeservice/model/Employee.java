package com.noua.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private Integer id;
    private Integer departId;
    private String name;
    private int age;
    private String position;
}
