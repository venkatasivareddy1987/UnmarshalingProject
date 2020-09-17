package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Description {
	
	public String r10ExCulture;
    public String content;
    @JsonProperty("TypeCode") 
    public String typeCode;
	public String getR10ExCulture() {
		return r10ExCulture;
	}
	public void setR10ExCulture(String r10ExCulture) {
		this.r10ExCulture = r10ExCulture;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
    
    
}
