package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class POSLog {

	@JsonProperty("MajorVersion") 
    public int majorVersion;
    public String xmlns;
    @JsonProperty("FixVersion") 
    public int fixVersion;
    @JsonProperty("Transaction") 
    public Transaction transaction;
    @JsonProperty("MinorVersion") 
    public int minorVersion;
    @JsonProperty("xmlns:r10Ex")
    public String xmlnsr10Ex;
    @JsonProperty("xmlns:xsi")
    public String xmlnsxsi;
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public int getFixVersion() {
		return fixVersion;
	}
	public void setFixVersion(int fixVersion) {
		this.fixVersion = fixVersion;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	public String getXmlnsr10Ex() {
		return xmlnsr10Ex;
	}
	public void setXmlnsr10Ex(String xmlnsr10Ex) {
		this.xmlnsr10Ex = xmlnsr10Ex;
	}
	public String getXmlnsxsi() {
		return xmlnsxsi;
	}
	public void setXmlnsxsi(String xmlnsxsi) {
		this.xmlnsxsi = xmlnsxsi;
	}
    
}
