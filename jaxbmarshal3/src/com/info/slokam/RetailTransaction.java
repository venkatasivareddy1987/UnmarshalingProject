package com.info.slokam;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetailTransaction {
	public R10ExUpsellOffer r10ExUpsellOffer;
    public R10ExCustomerSurvey r10ExCustomerSurvey;
    public String r10ExForms;
    @JsonProperty("Customer") 
    public Customer customer;
    public R10ExVenueShift r10ExVenueShift;
    @JsonProperty("Total") 
    public List<Total> total;
    @JsonProperty("PromotionsSummary") 
    public PromotionsSummary promotionsSummary;
    @JsonProperty("LineItem") 
    public List<LineItem> lineItem;
	public R10ExUpsellOffer getR10ExUpsellOffer() {
		return r10ExUpsellOffer;
	}
	public void setR10ExUpsellOffer(R10ExUpsellOffer r10ExUpsellOffer) {
		this.r10ExUpsellOffer = r10ExUpsellOffer;
	}
	public R10ExCustomerSurvey getR10ExCustomerSurvey() {
		return r10ExCustomerSurvey;
	}
	public void setR10ExCustomerSurvey(R10ExCustomerSurvey r10ExCustomerSurvey) {
		this.r10ExCustomerSurvey = r10ExCustomerSurvey;
	}
	public String getR10ExForms() {
		return r10ExForms;
	}
	public void setR10ExForms(String r10ExForms) {
		this.r10ExForms = r10ExForms;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public R10ExVenueShift getR10ExVenueShift() {
		return r10ExVenueShift;
	}
	public void setR10ExVenueShift(R10ExVenueShift r10ExVenueShift) {
		this.r10ExVenueShift = r10ExVenueShift;
	}
	public List<Total> getTotal() {
		return total;
	}
	public void setTotal(List<Total> total) {
		this.total = total;
	}
	public PromotionsSummary getPromotionsSummary() {
		return promotionsSummary;
	}
	public void setPromotionsSummary(PromotionsSummary promotionsSummary) {
		this.promotionsSummary = promotionsSummary;
	}
	public List<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}
    
}
