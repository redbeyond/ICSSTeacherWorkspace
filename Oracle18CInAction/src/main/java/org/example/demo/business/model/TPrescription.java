package org.example.demo.business.model;

import java.util.Date;

public class TPrescription extends BaseEntity {
    private String prescriptionNo;

    private Date orderDatetime;

    private String caseRecNo;

    private String createCode;

    private Date createDate;

    private String updateCode;

    private Date updateDate;

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public Date getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getCaseRecNo() {
        return caseRecNo;
    }

    public void setCaseRecNo(String caseRecNo) {
        this.caseRecNo = caseRecNo;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}