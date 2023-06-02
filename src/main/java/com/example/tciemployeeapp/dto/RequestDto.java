package com.example.tciemployeeapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * request
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
public class RequestDto  implements Serializable {

    private static final long serialVersionUID = 716728467288853917L;

    private List<BonusDto> bonus;
}
