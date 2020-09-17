package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Total {

	@JsonProperty("CurrencyCode") 
    public String currencyCode;
    public double content;
    @JsonProperty("TotalType") 
    public String totalType;
    @JsonProperty("TypeCode") 
    public String typeCode;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public double getContent() {
		return content;
	}
	public void setContent(double content) {
		this.content = content;
	}
	public String getTotalType() {
		return totalType;
	}
	public void setTotalType(String totalType) {
		this.totalType = totalType;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
    
}
