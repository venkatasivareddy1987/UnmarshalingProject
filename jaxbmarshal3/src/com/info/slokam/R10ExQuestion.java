package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class R10ExQuestion {
	@JsonProperty("ReferenceId") 
    public String referenceId;
    public String content;
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
}
