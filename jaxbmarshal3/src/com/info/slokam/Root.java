package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	/*
	 * @JsonProperty("Sale") public Sale sale;
	 * 
	 * public Sale getSale() { return sale; }
	 * 
	 * public void setSale(Sale sale) { this.sale = sale; }
	 */	
	
	@JsonProperty("POSLog") 
    public POSLog pOSLog;

	public POSLog getpOSLog() {
		return pOSLog;
	}

	public void setpOSLog(POSLog pOSLog) {
		this.pOSLog = pOSLog;
	}
	
}
