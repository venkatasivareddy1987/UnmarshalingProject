package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineItem {
	@JsonProperty("Sale") 
    public Sale sale;
    @JsonProperty("EntryMethod") 
    public String entryMethod;
    @JsonProperty("EndDateTime") 
    public EndDateTime endDateTime;
    @JsonProperty("ScanData") 
    public int scanData;
    @JsonProperty("SequenceNumber") 
    public int sequenceNumber;
    @JsonProperty("BeginDateTime") 
    public BeginDateTime beginDateTime;
    @JsonProperty("Tender") 
    public Tender tender;
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public String getEntryMethod() {
		return entryMethod;
	}
	public void setEntryMethod(String entryMethod) {
		this.entryMethod = entryMethod;
	}
	public EndDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(EndDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public int getScanData() {
		return scanData;
	}
	public void setScanData(int scanData) {
		this.scanData = scanData;
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public BeginDateTime getBeginDateTime() {
		return beginDateTime;
	}
	public void setBeginDateTime(BeginDateTime beginDateTime) {
		this.beginDateTime = beginDateTime;
	}
	public Tender getTender() {
		return tender;
	}
	public void setTender(Tender tender) {
		this.tender = tender;
	}
    
}
