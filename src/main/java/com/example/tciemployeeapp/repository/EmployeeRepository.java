package com.example.tciemployeeapp.repository;

import com.example.tciemployeeapp.dto.BonusDto;
import com.example.tciemployeeapp.dto.EmployeeDto;
import com.example.tciemployeeapp.model.entity.Employee;

import java.util.List;
import java.util.Map;

/**
 * EmployeeRepository
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
public interface EmployeeRepository {

    public  List<Employee> getEmployee (List<String> empName);

    public Employee getEmployeeByName(String empName, String dep);
    public Map<String, List<EmployeeDto>> map (List<BonusDto> bonusList);
}
