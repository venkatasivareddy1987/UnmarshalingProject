package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class R10ExRating {

	@JsonProperty("ReferenceId") 
    public String referenceId;
    @JsonProperty("Index") 
    public int index;
    @JsonProperty("IsSelected") 
    public boolean isSelected;
    public String content;
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
}
