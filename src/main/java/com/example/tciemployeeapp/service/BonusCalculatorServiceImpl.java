package com.example.tciemployeeapp.service;

import com.example.tciemployeeapp.dto.BonusDto;
import com.example.tciemployeeapp.dto.EmployeeDto;
import com.example.tciemployeeapp.exception.TciException;
import com.example.tciemployeeapp.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * BonusCalculatorServiceImpl
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@Slf4j
@Service
public class BonusCalculatorServiceImpl implements BonusCalculatorService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Map<String, List<EmployeeDto>> calculate(List<BonusDto> bonusList) throws TciException {
        Map<String, List<EmployeeDto>> dataList = employeeRepository.map(bonusList);
        if (CollectionUtils.isEmpty(dataList)) {
            throw new TciException("No Employee is eligible for bonus");
        }
        return dataList;

    }
}
