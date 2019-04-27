package org.example.demo.business.model;

import java.util.Date;

public class TPrescription extends BaseEntity {
	private String prescriptionNo;

	private Date orderDatetime;

	private String caseRecNo;

	public String getPrescriptionNo() {
		return prescriptionNo;
	}

	public void setPrescriptionNo(String prescriptionNo) {
		this.prescriptionNo = prescriptionNo;
	}

	public Date getOrderDatetime() {
		return orderDatetime;
	}

	public void setOrderDatetime(Date orderDatetime) {
		this.orderDatetime = orderDatetime;
	}

	public String getCaseRecNo() {
		return caseRecNo;
	}

	public void setCaseRecNo(String caseRecNo) {
		this.caseRecNo = caseRecNo;
	}
}