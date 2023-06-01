package com.example.tciemployeeapp.controller;

import com.example.tciemployeeapp.dto.EmployeeDto;
import com.example.tciemployeeapp.dto.RequestDto;
import com.example.tciemployeeapp.exception.TciException;
import com.example.tciemployeeapp.model.entity.Employee;
import com.example.tciemployeeapp.service.BonusCalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * EmployeeController
 *
 * @author Manish Singh
 * @email v-manishs1@xiaomi.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Resource
    private BonusCalculatorService bonusCalculatorService;

    @PostMapping(value = "/list")
    public Map<String, List<EmployeeDto>> list(@RequestBody RequestDto request) throws TciException {
        return bonusCalculatorService.calculate(request.getBonus());
    }

}
