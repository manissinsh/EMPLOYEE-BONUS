package com.example.tciemployeeapp.model.entity;

import lombok.ToString;

import javax.persistence.*;

/**
 * Employee
 *
 * @author Manish Singh
 * @email v-manishs1@xiaomi.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@Entity
@ToString
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "joining_date")
    private String joiningDate;

    @Column(name = "status")
    private Integer status;
}
