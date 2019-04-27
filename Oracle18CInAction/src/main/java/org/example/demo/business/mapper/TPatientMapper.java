package org.example.demo.business.mapper;

import java.util.List;

import org.example.demo.business.model.TPatient;

public interface TPatientMapper {
	int deleteByPrimaryKey(String patientNo);

	int insert(TPatient record);

	TPatient selectByPrimaryKey(String patientNo);

	List<TPatient> selectAll();

	int updateByPrimaryKey(TPatient record);
}