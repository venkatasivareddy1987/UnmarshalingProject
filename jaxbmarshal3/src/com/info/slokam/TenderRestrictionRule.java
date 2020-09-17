package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TenderRestrictionRule {
	@JsonProperty("ItemLink") 
    public int itemLink;

	public int getItemLink() {
		return itemLink;
	}

	public void setItemLink(int itemLink) {
		this.itemLink = itemLink;
	}
	
}
