package org.example.demo.business.model;

public class TPrescriptionDetail extends BaseEntity {
	private String prescriptionNo;

	private Short seqNo;

	private String drugCode;

	private Short quantity;

	public String getPrescriptionNo() {
		return prescriptionNo;
	}

	public void setPrescriptionNo(String prescriptionNo) {
		this.prescriptionNo = prescriptionNo;
	}

	public Short getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Short seqNo) {
		this.seqNo = seqNo;
	}

	public String getDrugCode() {
		return drugCode;
	}

	public void setDrugCode(String drugCode) {
		this.drugCode = drugCode;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}
}