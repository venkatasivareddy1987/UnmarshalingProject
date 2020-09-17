package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quantity {
	
	@JsonProperty("UnitOfMeasureCode") 
    public String unitOfMeasureCode;
    @JsonProperty("EntryMethod") 
    public String entryMethod;
    @JsonProperty("Units") 
    public int units;
    public int content;
	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}
	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}
	public String getEntryMethod() {
		return entryMethod;
	}
	public void setEntryMethod(String entryMethod) {
		this.entryMethod = entryMethod;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
    
    
}
