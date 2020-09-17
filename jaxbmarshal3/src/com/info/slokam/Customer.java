package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	public String r10ExCustomerType;
    public String r10ExScanData;
    public boolean r10ExIsAuthenticatedOffline;
    public String r10ExCustomerExternalId;
    public String r10ExIdentificationMethod;
    @JsonProperty("CustomerID") 
    public String customerID;
	public String getR10ExCustomerType() {
		return r10ExCustomerType;
	}
	public void setR10ExCustomerType(String r10ExCustomerType) {
		this.r10ExCustomerType = r10ExCustomerType;
	}
	public String getR10ExScanData() {
		return r10ExScanData;
	}
	public void setR10ExScanData(String r10ExScanData) {
		this.r10ExScanData = r10ExScanData;
	}
	public boolean isR10ExIsAuthenticatedOffline() {
		return r10ExIsAuthenticatedOffline;
	}
	public void setR10ExIsAuthenticatedOffline(boolean r10ExIsAuthenticatedOffline) {
		this.r10ExIsAuthenticatedOffline = r10ExIsAuthenticatedOffline;
	}
	public String getR10ExCustomerExternalId() {
		return r10ExCustomerExternalId;
	}
	public void setR10ExCustomerExternalId(String r10ExCustomerExternalId) {
		this.r10ExCustomerExternalId = r10ExCustomerExternalId;
	}
	public String getR10ExIdentificationMethod() {
		return r10ExIdentificationMethod;
	}
	public void setR10ExIdentificationMethod(String r10ExIdentificationMethod) {
		this.r10ExIdentificationMethod = r10ExIdentificationMethod;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
    
    
}
