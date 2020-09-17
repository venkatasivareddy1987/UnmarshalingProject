package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemUomData {
	
	public String xmlns;
    @JsonProperty("Uom") 
    public String uom;
    @JsonProperty("Value") 
    public int value;
    @JsonProperty("PackSize") 
    public int packSize;
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getPackSize() {
		return packSize;
	}
	public void setPackSize(int packSize) {
		this.packSize = packSize;
	}
    
    
}
