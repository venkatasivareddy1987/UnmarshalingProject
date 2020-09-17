package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cashback {
	@JsonProperty("Currency") 
    public String currency;
    public int content;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
    
}
