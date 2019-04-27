package org.example.demo.business.mapper;

import java.util.List;

import org.example.demo.business.model.TCaseRecord;

public interface TCaseRecordMapper {
	int deleteByPrimaryKey(String caseRecNo);

	int insert(TCaseRecord record);

	TCaseRecord selectByPrimaryKey(String caseRecNo);

	List<TCaseRecord> selectAll();

	int updateByPrimaryKey(TCaseRecord record);
}