package com.gaurav.dto;

import com.gaurav.model.Employee;

public class EmployeeDTO {
	private Integer eid;
	private String name;
	private String dept;
	private double sal;
	private CompanyDTO cdto;
	
	public EmployeeDTO(Integer eid, String name, String dept, double sal, CompanyDTO cdto) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.cdto = cdto;
	}
	
	public CompanyDTO getCdto() {
		return cdto;
	}

	public void setCdto(CompanyDTO cdto) {
		this.cdto = cdto;
	}

	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDTO [eid=" + eid + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", cdto=" + cdto
				+ "]";
	}
	
	
	public static EmployeeDTO entityToDTO(Employee e) {
		EmployeeDTO edto = new EmployeeDTO();
		edto.setEid(e.getEid());
		edto.setName(e.getName());
		edto.setSal(e.getSal());
		edto.setDept(e.getDept());
		CompanyDTO cdto = new CompanyDTO();
		cdto.setCid(e.getCid());
		edto.setCdto(cdto);
		return edto;
		
	}
	
	public Employee createEntity() {
		Employee e = new Employee();
		e.setName(this.getName());
		e.setDept(this.getDept());
		e.setSal(this.getSal());
		if(this.getCdto()!=null && this.getCdto().getCid()!=null) {
			e.setCid(this.getCdto().getCid());
		}
		return e;
	}
}
