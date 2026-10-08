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

import com.gaurav.dto.CompanyDTO;
import com.gaurav.exception.CompanyException;
import com.gaurav.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	private CompanyService eser;

	@PostMapping("/company")
	public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO edto) {
		// TODO Auto-generated method stub
		return new ResponseEntity<CompanyDTO>(eser.createCompany(edto), HttpStatus.ACCEPTED);
	}

	@GetMapping("/companys")
	public ResponseEntity<List<CompanyDTO>> getAllCompanys() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<CompanyDTO>>(eser.getAllCompanys(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/company/{eid}")
	public ResponseEntity<CompanyDTO> getById(@PathVariable int eid) throws CompanyException {
		// TODO Auto-generated method stub
		return new ResponseEntity<CompanyDTO>(eser.getById(eid), HttpStatus.ACCEPTED);
	}

	@PutMapping("/company/{eid}")
	public ResponseEntity<CompanyDTO> updateCompany(@RequestBody CompanyDTO edto, @PathVariable int eid)
			throws CompanyException {
		// TODO Auto-generated method stub
		return new ResponseEntity<CompanyDTO>(eser.updateCompany(edto, eid), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/company/{eid}")
	public ResponseEntity<CompanyDTO> delete(@PathVariable int eid) throws CompanyException {
		// TODO Auto-generated method stub
		return new ResponseEntity<CompanyDTO>(eser.delete(eid), HttpStatus.GONE);
	}

}
