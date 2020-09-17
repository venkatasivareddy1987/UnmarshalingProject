package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

	@JsonProperty("MajorVersion") 
    public int majorVersion;
    @JsonProperty("FixVersion") 
    public int fixVersion;
    @JsonProperty("MinorVersion") 
    public int minorVersion;
    @JsonProperty("RetailTransaction") 
    public RetailTransaction retailTransaction;
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public int getFixVersion() {
		return fixVersion;
	}
	public void setFixVersion(int fixVersion) {
		this.fixVersion = fixVersion;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	public RetailTransaction getRetailTransaction() {
		return retailTransaction;
	}
	public void setRetailTransaction(RetailTransaction retailTransaction) {
		this.retailTransaction = retailTransaction;
	}
    
    
}
