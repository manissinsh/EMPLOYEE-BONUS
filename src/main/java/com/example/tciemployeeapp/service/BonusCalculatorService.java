package com.example.tciemployeeapp.service;

import com.example.tciemployeeapp.dto.BonusDto;
import com.example.tciemployeeapp.dto.EmployeeDto;
import com.example.tciemployeeapp.exception.TciException;

import java.util.List;
import java.util.Map;

/**
 * BonusCalculatorService
 *
 * @author Manish Singh
 * @email v-manishs1@xiaomi.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/

public interface BonusCalculatorService {

    public Map<String, List<EmployeeDto>> calculate(List<BonusDto> bonusList) throws TciException;
}
