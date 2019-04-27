package org.example.demo.business.mapper;

import java.util.List;

import org.example.demo.business.model.TRegister;

public interface TRegisterMapper {
	int deleteByPrimaryKey(String registerNo);

	int insert(TRegister record);

	TRegister selectByPrimaryKey(String registerNo);

	List<TRegister> selectAll();

	int updateByPrimaryKey(TRegister record);
}