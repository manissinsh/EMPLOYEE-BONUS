package com.example.tciemployeeapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Bonus
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@Getter
@Setter
@ToString
public class BonusDto  implements Serializable {

    private static final long serialVersionUID = 1638726191681191496L;

    private String empName;
    private String department;
    private Integer amount;
    private String currency;
    private String joiningDate;
    private String exitDate;
}
