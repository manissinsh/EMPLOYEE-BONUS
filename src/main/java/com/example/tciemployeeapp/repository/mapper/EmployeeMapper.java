package com.example.tciemployeeapp.repository.mapper;

import com.example.tciemployeeapp.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * EmployeeMapper
 *
 * @author Manish Singh
 * @email v-manishs1@xiaomi.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
public interface EmployeeMapper extends JpaRepository<Employee, Long> {

    List<Employee> findByNameInAndStatus(List<String> name, Integer status);

    Employee findByNameAndDepartmentAndStatus(String name,String department, Integer status);
}
