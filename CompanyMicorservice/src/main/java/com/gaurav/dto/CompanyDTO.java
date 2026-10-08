package com.gaurav.dto;

import com.gaurav.model.Company;

public class CompanyDTO {
	private Integer cid;
	private String cName;

	public Integer getCid() {
		return cid;
	}

	public void setEid(Integer cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompanyDTO [cid=" + cid + ", cName=" + cName + "]";
	}

	public static CompanyDTO entityToDTO(Company e) {
		CompanyDTO edto = new CompanyDTO();
		edto.setCid(e.getCid());
		edto.setcName(e.getCName());

		return edto;

	}

	public Company createEntity() {
		Company e = new Company();
		e.setCName(this.getcName());
		return e;
	}
}
