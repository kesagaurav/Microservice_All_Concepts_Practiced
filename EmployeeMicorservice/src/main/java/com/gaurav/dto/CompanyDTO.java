package com.gaurav.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CompanyDTO {

	private Integer cid;

	private String cName;

	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyDTO(Integer cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "CompanyDTO [cid=" + cid + ", cName=" + cName + "]";
	}
	
	
}
