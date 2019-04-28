package org.example.demo.business.model;

import java.util.Date;

public class TCaseRecord extends BaseEntity {
    private String caseRecNo;

    private Date consultationDate;

    private String mainSymptom;

    private String staffCode;

    private String patientNo;

    private String createCode;

    private Date createDate;

    private String updateCode;

    private Date updateDate;

    public String getCaseRecNo() {
        return caseRecNo;
    }

    public void setCaseRecNo(String caseRecNo) {
        this.caseRecNo = caseRecNo;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getMainSymptom() {
        return mainSymptom;
    }

    public void setMainSymptom(String mainSymptom) {
        this.mainSymptom = mainSymptom;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
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