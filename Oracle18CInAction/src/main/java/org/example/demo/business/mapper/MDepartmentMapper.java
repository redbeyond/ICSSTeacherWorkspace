package org.example.demo.business.mapper;

import java.util.List;

import org.example.demo.business.model.MDepartment;

public interface MDepartmentMapper {
	int deleteByPrimaryKey(String deptCode);

	int insert(MDepartment record);

	MDepartment selectByPrimaryKey(String deptCode);

	List<MDepartment> selectAll();

	int updateByPrimaryKey(MDepartment record);
}