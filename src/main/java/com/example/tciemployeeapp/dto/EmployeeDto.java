package com.example.tciemployeeapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Employee
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@Setter
@Getter
@ToString
public class EmployeeDto implements Serializable {

    private static final long serialVersionUID = -498013435165204044L;

    private String empName;
    private Integer amount;
}
