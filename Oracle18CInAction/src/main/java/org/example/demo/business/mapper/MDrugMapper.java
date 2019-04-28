package org.example.demo.business.mapper;

import java.util.List;
import org.example.demo.business.model.MDrug;

public interface MDrugMapper {
    int deleteByPrimaryKey(String drugCode);

    int insert(MDrug record);

    MDrug selectByPrimaryKey(String drugCode);

    List<MDrug> selectAll();

    int updateByPrimaryKey(MDrug record);
}