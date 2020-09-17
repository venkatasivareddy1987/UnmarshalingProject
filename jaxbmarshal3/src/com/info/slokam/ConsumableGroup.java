package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsumableGroup {
	
	public String xmlns;
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("ID") 
    public String iD;
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
    
    
}
