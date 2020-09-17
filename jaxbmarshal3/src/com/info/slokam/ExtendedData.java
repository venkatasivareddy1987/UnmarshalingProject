package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtendedData {
	@JsonProperty("xmlns:xsd")
	public String xmlnsxsd;
	public String xmlns;
	@JsonProperty("Data")
	public Data data;
	public String getXmlnsxsd() {
		return xmlnsxsd;
	}
	public void setXmlnsxsd(String xmlnsxsd) {
		this.xmlnsxsd = xmlnsxsd;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
}
