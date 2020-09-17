package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	@JsonProperty("Key") 
    public String key;
    public long content;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public long getContent() {
		return content;
	}
	public void setContent(long content) {
		this.content = content;
	}
    
}
