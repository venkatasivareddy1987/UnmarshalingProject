package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class POSIdentity {
	
	@JsonProperty("POSItemID") 
    public int pOSItemID;

	public int getpOSItemID() {
		return pOSItemID;
	}

	public void setpOSItemID(int pOSItemID) {
		this.pOSItemID = pOSItemID;
	}
	
}
