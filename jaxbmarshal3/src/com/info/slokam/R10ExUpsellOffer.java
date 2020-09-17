package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class R10ExUpsellOffer {
	@JsonProperty("Behaviour") 
    public String behaviour;
    @JsonProperty("CustomerID") 
    public String customerID;
    @JsonProperty("UpsellOfferId") 
    public String upsellOfferId;
    public String content;
	public String getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getUpsellOfferId() {
		return upsellOfferId;
	}
	public void setUpsellOfferId(String upsellOfferId) {
		this.upsellOfferId = upsellOfferId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
}
