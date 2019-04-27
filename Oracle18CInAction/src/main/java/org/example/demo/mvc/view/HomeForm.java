package org.example.demo.mvc.view;

import org.example.demo.business.model.TPatient;

public class HomeForm {
	private String dbInfo;
	private TPatient patient;

	public String getDbInfo() {
		return dbInfo;
	}

	public void setDbInfo(String dbInfo) {
		this.dbInfo = dbInfo;
	}

	public TPatient getPatient() {
		return patient;
	}

	public void setPatient(TPatient patient) {
		this.patient = patient;
	}

}
