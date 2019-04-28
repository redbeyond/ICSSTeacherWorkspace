CREATE TABLE T_PRESCRIPTION (
    PRESCRIPTION_NO CHAR(14),
    ORDER_DATETIME DATE,
    CASE_REC_NO CHAR(14)
)
/
ALTER TABLE T_PRESCRIPTION ADD CONSTRAINT PK_T_PRESCRIPTION PRIMARY KEY (PRESCRIPTION_NO)
/
ALTER TABLE T_PRESCRIPTION ADD CONSTRAINT FK_T_PRESCRIPTION_T_CASE_RECORD FOREIGN KEY (CASE_REC_NO) REFERENCES T_CASE_RECORD(CASE_REC_NO)
/
COMMENT ON TABLE T_PRESCRIPTION IS '处方表'
/
COMMENT ON COLUMN T_PRESCRIPTION.PRESCRIPTION_NO IS '处方编号'
/
COMMENT ON COLUMN T_PRESCRIPTION.ORDER_DATETIME IS '开方时间'
/
COMMENT ON COLUMN T_PRESCRIPTION.CASE_REC_NO IS '病历编号'
/
