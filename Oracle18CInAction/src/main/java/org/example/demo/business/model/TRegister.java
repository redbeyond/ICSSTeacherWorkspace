package org.example.demo.business.model;

import java.math.BigDecimal;
import java.util.Date;

public class TRegister extends BaseEntity {
	private String registerNo;

	private Date registerDatetime;

	private BigDecimal registerFee;

	private String patientNo;

	private String deptCode;

	private String staffCode;

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public Date getRegisterDatetime() {
		return registerDatetime;
	}

	public void setRegisterDatetime(Date registerDatetime) {
		this.registerDatetime = registerDatetime;
	}

	public BigDecimal getRegisterFee() {
		return registerFee;
	}

	public void setRegisterFee(BigDecimal registerFee) {
		this.registerFee = registerFee;
	}

	public String getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
}