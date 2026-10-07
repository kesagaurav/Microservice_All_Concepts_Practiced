package com.gaurav.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.dto.CompanyDTO;
import com.gaurav.exception.CompanyException;
import com.gaurav.model.Company;
import com.gaurav.repository.CompanyRepository;
import com.gaurav.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepository erepo;
	@Override
	public CompanyDTO createCompany(CompanyDTO edto) {
		// TODO Auto-generated method stub
		Company createEntity = edto.createEntity();
		Company save = erepo.save(createEntity);
		return CompanyDTO.entityToDTO(save);
	}

	@Override
	public List<CompanyDTO> getAllCompanys() {
		// TODO Auto-generated method stub
		return erepo.findAll().stream().map(a->CompanyDTO.entityToDTO(a)).collect(Collectors.toList());
	}

	@Override
	public CompanyDTO getById(int eid) throws CompanyException {
		// TODO Auto-generated method stub
		Company orElseThrow = erepo.findById(eid).orElseThrow(()->new CompanyException("id is not found " + eid));
		//		if(eid==1) {
//			throw  new RuntimeException();
//		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CompanyDTO.entityToDTO(orElseThrow);
	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO edto, int eid) throws CompanyException {
		// TODO Auto-generated method stub
		Company orElseThrow = erepo.findById(eid).orElseThrow(()->new CompanyException("id is not found " + eid));
		orElseThrow.setCName(edto.getcName());
		Company save = erepo.save(orElseThrow);
		return CompanyDTO.entityToDTO(save);
	}

	@Override
	public CompanyDTO delete(int eid) throws CompanyException {
		// TODO Auto-generated method stub
		 Company e = erepo.findById(eid).orElseThrow(()->new CompanyException("id is not found " + eid));
		erepo.delete(e);
		 return CompanyDTO.entityToDTO(e);
	}

}
