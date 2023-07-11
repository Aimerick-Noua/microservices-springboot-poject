package com.noua.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private int id;
    private Long departId;
    private String name;

    private int age;
    private String position;
}
