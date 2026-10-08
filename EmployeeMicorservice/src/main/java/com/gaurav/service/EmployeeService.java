package com.gaurav.service;

import com.gaurav.dto.EmployeeDTO;
import com.gaurav.exception.EmployeeException;

import java.util.*;
public interface EmployeeService {

	EmployeeDTO createEmployee(EmployeeDTO edto);
	List<EmployeeDTO> getAllEmployees();
	EmployeeDTO getById(int eid) throws EmployeeException;
	EmployeeDTO updateEmployee(EmployeeDTO edto,int eid) throws EmployeeException;
	EmployeeDTO delete(int eid) throws EmployeeException;
	
}
