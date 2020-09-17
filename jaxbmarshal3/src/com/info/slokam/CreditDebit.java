package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditDebit {

	public String r10ExMaskedAccountId;
    @JsonProperty("PrimaryAccountNumber") 
    public String primaryAccountNumber;
	public String getR10ExMaskedAccountId() {
		return r10ExMaskedAccountId;
	}
	public void setR10ExMaskedAccountId(String r10ExMaskedAccountId) {
		this.r10ExMaskedAccountId = r10ExMaskedAccountId;
	}
	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}
	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}
    
}
