package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.dto.EmployeeDTO;
import com.gaurav.exception.EmployeeException;
import com.gaurav.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService eser;

	@PostMapping("/employee")
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO edto) {
		// TODO Auto-generated method stub
		return new ResponseEntity<EmployeeDTO>(eser.createEmployee(edto), HttpStatus.ACCEPTED);
	}

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<EmployeeDTO>>(eser.getAllEmployees(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/employee/{eid}")
	public ResponseEntity<EmployeeDTO> getById(@PathVariable int eid) throws EmployeeException {
		// TODO Auto-generated method stub
		return new ResponseEntity<EmployeeDTO>(eser.getById(eid), HttpStatus.ACCEPTED);
	}

	@PutMapping("/employee/{eid}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO edto, @PathVariable int eid)
			throws EmployeeException {
		// TODO Auto-generated method stub
		return new ResponseEntity<EmployeeDTO>(eser.updateEmployee(edto, eid), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/employee/{eid}")
	public ResponseEntity<EmployeeDTO> delete(@PathVariable int eid) throws EmployeeException {
		// TODO Auto-generated method stub
		return new ResponseEntity<EmployeeDTO>(eser.delete(eid), HttpStatus.GONE);
	}

}
