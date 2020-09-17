package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchandiseHierarchy {
	
	@JsonProperty("ID") 
    public String iD;
    public int content;
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
    
}
