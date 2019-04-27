package org.example.demo.business.service;

import org.example.demo.business.dao.PatientDao;
import org.example.demo.business.model.TPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientDao patientDao;

	public TPatient findPatientById(String patientNo) {

		return this.patientDao.findEntityId(patientNo);

	}

}
