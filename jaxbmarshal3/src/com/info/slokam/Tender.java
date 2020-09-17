package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tender {

	@JsonProperty("Authorization") 
    public Authorization authorization;
    @JsonProperty("CreditDebit") 
    public CreditDebit creditDebit;
    @JsonProperty("TenderID") 
    public int tenderID;
    public boolean r10ExIsAutoReconcile;
    @JsonProperty("Amount") 
    public Amount amount;
    @JsonProperty("TenderRestrictionRule") 
    public TenderRestrictionRule tenderRestrictionRule;
    @JsonProperty("Cashback") 
    public Cashback cashback;
    public String r10ExTenderDescription;
    @JsonProperty("TenderType") 
    public String tenderType;
	public Authorization getAuthorization() {
		return authorization;
	}
	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}
	public CreditDebit getCreditDebit() {
		return creditDebit;
	}
	public void setCreditDebit(CreditDebit creditDebit) {
		this.creditDebit = creditDebit;
	}
	public int getTenderID() {
		return tenderID;
	}
	public void setTenderID(int tenderID) {
		this.tenderID = tenderID;
	}
	public boolean isR10ExIsAutoReconcile() {
		return r10ExIsAutoReconcile;
	}
	public void setR10ExIsAutoReconcile(boolean r10ExIsAutoReconcile) {
		this.r10ExIsAutoReconcile = r10ExIsAutoReconcile;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public TenderRestrictionRule getTenderRestrictionRule() {
		return tenderRestrictionRule;
	}
	public void setTenderRestrictionRule(TenderRestrictionRule tenderRestrictionRule) {
		this.tenderRestrictionRule = tenderRestrictionRule;
	}
	public Cashback getCashback() {
		return cashback;
	}
	public void setCashback(Cashback cashback) {
		this.cashback = cashback;
	}
	public String getR10ExTenderDescription() {
		return r10ExTenderDescription;
	}
	public void setR10ExTenderDescription(String r10ExTenderDescription) {
		this.r10ExTenderDescription = r10ExTenderDescription;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
    
}
