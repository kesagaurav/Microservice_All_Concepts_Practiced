package com.gaurav.service;

import com.gaurav.dto.CompanyDTO;
import com.gaurav.exception.CompanyException;

import java.util.*;
public interface CompanyService {

	CompanyDTO createCompany(CompanyDTO edto);
	List<CompanyDTO> getAllCompanys();
	CompanyDTO getById(int eid) throws CompanyException;
	CompanyDTO updateCompany(CompanyDTO edto,int eid) throws CompanyException;
	CompanyDTO delete(int eid) throws CompanyException;
	
}
