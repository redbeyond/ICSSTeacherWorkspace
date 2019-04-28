package org.example.demo.business.mapper;

import java.util.List;
import org.example.demo.business.model.MStaff;

public interface MStaffMapper {
    int deleteByPrimaryKey(String staffCode);

    int insert(MStaff record);

    MStaff selectByPrimaryKey(String staffCode);

    List<MStaff> selectAll();

    int updateByPrimaryKey(MStaff record);
}