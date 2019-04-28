package org.example.demo.business.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.demo.business.model.TPrescriptionDetail;

public interface TPrescriptionDetailMapper {
    int deleteByPrimaryKey(@Param("prescriptionNo") String prescriptionNo, @Param("seqNo") Short seqNo);

    int insert(TPrescriptionDetail record);

    TPrescriptionDetail selectByPrimaryKey(@Param("prescriptionNo") String prescriptionNo, @Param("seqNo") Short seqNo);

    List<TPrescriptionDetail> selectAll();

    int updateByPrimaryKey(TPrescriptionDetail record);
}