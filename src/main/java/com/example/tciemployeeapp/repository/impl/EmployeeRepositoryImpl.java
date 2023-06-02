package com.example.tciemployeeapp.repository.impl;

import com.example.tciemployeeapp.dto.BonusDto;
import com.example.tciemployeeapp.dto.EmployeeDto;
import com.example.tciemployeeapp.model.entity.Employee;
import com.example.tciemployeeapp.repository.EmployeeRepository;
import com.example.tciemployeeapp.repository.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * EmployeeRepositoryImpl
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@Slf4j
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployee(List<String> empName) {
        return employeeMapper.findByNameInAndStatus(empName,1);
    }

    @Override
    public Employee getEmployeeByName(String empName, String dep) {
        return employeeMapper.findByNameAndDepartmentAndStatus(empName,dep, 1);
    }

    @Override
    public Map<String, List<EmployeeDto>> map(List<BonusDto> bonusList) {
        log.info("BonusCalculator : {}", bonusList);
        List<String> empNameList = bonusList.stream().map(BonusDto::getEmpName).collect(Collectors.toList());
        log.info("BonusCalculator:List : {}", empNameList);
        List<Employee> employeeList = this.getEmployee(empNameList);
        log.info("BonusCalculator:employeeList : {}", employeeList);
        List<Map<String, EmployeeDto>> bonusLists = new ArrayList<>();
        for (BonusDto data : bonusList) {
            Employee employee = this.getEmployeeByName(data.getEmpName(), data.getDepartment());
            log.info("BonusCalculator:employee : {}", employee);
            if(!ObjectUtils.isEmpty(employee)){
                HashMap<String, EmployeeDto> currencyEmpMapData = new HashMap<>();
                EmployeeDto employeeDto = new EmployeeDto();
                BeanUtils.copyProperties(data, employeeDto);
                currencyEmpMapData.put(data.getCurrency(), employeeDto);
                bonusLists.add(currencyEmpMapData);
            }
        }
        log.info("BonusCalculator:bonusLists : {}", bonusLists);


        Map<String, List<EmployeeDto>> result = bonusLists.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        return result;
    }
}
