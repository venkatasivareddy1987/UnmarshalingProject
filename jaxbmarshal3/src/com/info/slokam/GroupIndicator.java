package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupIndicator {
	@JsonProperty("Group") 
    public String group;
    public String xmlns;
    @JsonProperty("Symbol") 
    public String symbol;
    @JsonProperty("Priority") 
    public int priority;
    @JsonProperty("Indicator") 
    public String indicator;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
    
    
}
