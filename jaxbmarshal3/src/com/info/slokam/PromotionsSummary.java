package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionsSummary {

	@JsonProperty("xmlns:xsd")
	public String xmlnsxsd;
	@JsonProperty("PromotionSummary")
	public PromotionSummary promotionSummary;
	public String xmlns;
	public String getXmlnsxsd() {
		return xmlnsxsd;
	}
	public void setXmlnsxsd(String xmlnsxsd) {
		this.xmlnsxsd = xmlnsxsd;
	}
	public PromotionSummary getPromotionSummary() {
		return promotionSummary;
	}
	public void setPromotionSummary(PromotionSummary promotionSummary) {
		this.promotionSummary = promotionSummary;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	
}
