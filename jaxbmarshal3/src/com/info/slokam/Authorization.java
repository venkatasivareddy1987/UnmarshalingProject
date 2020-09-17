package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {

	@JsonProperty("AuthorizationCode") 
    public int authorizationCode;
    @JsonProperty("ExtendedData") 
    public ExtendedData extendedData;
    public String r10ExAuthorizationType;
    @JsonProperty("ReferenceNumber") 
    public int referenceNumber;
    @JsonProperty("RequestedAmount") 
    public RequestedAmount requestedAmount;
    @JsonProperty("VerifiedByPINFlag") 
    public boolean verifiedByPINFlag;
    @JsonProperty("AuthorizationDateTime") 
    public AuthorizationDateTime authorizationDateTime;
    public String r10ExVerifiedByPINStatus;
    public String r10ExCardId;
    @JsonProperty("MerchantNumber") 
    public String merchantNumber;
    public String r10ExCardType;
    @JsonProperty("ReceiptText") 
    public String receiptText;
    @JsonProperty("SignatureRequiredFlag") 
    public boolean signatureRequiredFlag;
    public long r10ExTokenData;
    public String r10ExProviderData;
	public int getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(int authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public ExtendedData getExtendedData() {
		return extendedData;
	}
	public void setExtendedData(ExtendedData extendedData) {
		this.extendedData = extendedData;
	}
	public String getR10ExAuthorizationType() {
		return r10ExAuthorizationType;
	}
	public void setR10ExAuthorizationType(String r10ExAuthorizationType) {
		this.r10ExAuthorizationType = r10ExAuthorizationType;
	}
	public int getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public RequestedAmount getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(RequestedAmount requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	public boolean isVerifiedByPINFlag() {
		return verifiedByPINFlag;
	}
	public void setVerifiedByPINFlag(boolean verifiedByPINFlag) {
		this.verifiedByPINFlag = verifiedByPINFlag;
	}
	public AuthorizationDateTime getAuthorizationDateTime() {
		return authorizationDateTime;
	}
	public void setAuthorizationDateTime(AuthorizationDateTime authorizationDateTime) {
		this.authorizationDateTime = authorizationDateTime;
	}
	public String getR10ExVerifiedByPINStatus() {
		return r10ExVerifiedByPINStatus;
	}
	public void setR10ExVerifiedByPINStatus(String r10ExVerifiedByPINStatus) {
		this.r10ExVerifiedByPINStatus = r10ExVerifiedByPINStatus;
	}
	public String getR10ExCardId() {
		return r10ExCardId;
	}
	public void setR10ExCardId(String r10ExCardId) {
		this.r10ExCardId = r10ExCardId;
	}
	public String getMerchantNumber() {
		return merchantNumber;
	}
	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}
	public String getR10ExCardType() {
		return r10ExCardType;
	}
	public void setR10ExCardType(String r10ExCardType) {
		this.r10ExCardType = r10ExCardType;
	}
	public String getReceiptText() {
		return receiptText;
	}
	public void setReceiptText(String receiptText) {
		this.receiptText = receiptText;
	}
	public boolean isSignatureRequiredFlag() {
		return signatureRequiredFlag;
	}
	public void setSignatureRequiredFlag(boolean signatureRequiredFlag) {
		this.signatureRequiredFlag = signatureRequiredFlag;
	}
	public long getR10ExTokenData() {
		return r10ExTokenData;
	}
	public void setR10ExTokenData(long r10ExTokenData) {
		this.r10ExTokenData = r10ExTokenData;
	}
	public String getR10ExProviderData() {
		return r10ExProviderData;
	}
	public void setR10ExProviderData(String r10ExProviderData) {
		this.r10ExProviderData = r10ExProviderData;
	}
    
}
