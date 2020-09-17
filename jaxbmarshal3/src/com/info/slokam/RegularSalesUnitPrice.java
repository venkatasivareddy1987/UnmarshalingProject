package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegularSalesUnitPrice {
	@JsonProperty("Currency")
	public String currency;
	public double content;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getContent() {
		return content;
	}
	public void setContent(double content) {
		this.content = content;
	}
	
	}
