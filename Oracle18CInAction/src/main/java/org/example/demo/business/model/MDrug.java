package org.example.demo.business.model;

import java.math.BigDecimal;

public class MDrug extends BaseEntity {
	private String drugCode;

	private String category;

	private String drugName;

	private String tradeName;

	private String drugSpec;

	private BigDecimal retailPrice;

	private BigDecimal wholeSalePrice;

	private BigDecimal buyPrice;

	private BigDecimal drugAmount;

	public String getDrugCode() {
		return drugCode;
	}

	public void setDrugCode(String drugCode) {
		this.drugCode = drugCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getDrugSpec() {
		return drugSpec;
	}

	public void setDrugSpec(String drugSpec) {
		this.drugSpec = drugSpec;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BigDecimal getWholeSalePrice() {
		return wholeSalePrice;
	}

	public void setWholeSalePrice(BigDecimal wholeSalePrice) {
		this.wholeSalePrice = wholeSalePrice;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getDrugAmount() {
		return drugAmount;
	}

	public void setDrugAmount(BigDecimal drugAmount) {
		this.drugAmount = drugAmount;
	}
}