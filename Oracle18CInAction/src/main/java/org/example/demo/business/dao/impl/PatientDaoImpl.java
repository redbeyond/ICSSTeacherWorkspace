package org.example.demo.business.dao.impl;

import org.example.demo.business.dao.PatientDao;
import org.example.demo.business.model.TPatient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDaoImpl extends BaseDaoImpl<TPatient, String> implements PatientDao {

}
