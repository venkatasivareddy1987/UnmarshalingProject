package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemID {
	@JsonProperty("Type")
	public String type;
	public int content;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	
	
}
