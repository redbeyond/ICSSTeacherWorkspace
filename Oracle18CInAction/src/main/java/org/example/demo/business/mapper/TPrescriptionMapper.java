package org.example.demo.business.mapper;

import java.util.List;
import org.example.demo.business.model.TPrescription;

public interface TPrescriptionMapper {
    int deleteByPrimaryKey(String prescriptionNo);

    int insert(TPrescription record);

    TPrescription selectByPrimaryKey(String prescriptionNo);

    List<TPrescription> selectAll();

    int updateByPrimaryKey(TPrescription record);
}