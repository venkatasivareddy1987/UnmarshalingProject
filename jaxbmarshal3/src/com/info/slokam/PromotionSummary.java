package com.info.slokam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionSummary {

	@JsonProperty("QualifyingSpent") 
    public double qualifyingSpent;
    @JsonProperty("PromotionID") 
    public String promotionID;
    @JsonProperty("TotalRewardAmount") 
    public int totalRewardAmount;
    @JsonProperty("Message") 
    public String message;
    @JsonProperty("RewardType") 
    public String rewardType;
    @JsonProperty("PromotionDescription") 
    public String promotionDescription;
    @JsonProperty("TriggerTiming") 
    public String triggerTiming;
    @JsonProperty("RedemptionQuantity") 
    public int redemptionQuantity;
	public double getQualifyingSpent() {
		return qualifyingSpent;
	}
	public void setQualifyingSpent(double qualifyingSpent) {
		this.qualifyingSpent = qualifyingSpent;
	}
	public String getPromotionID() {
		return promotionID;
	}
	public void setPromotionID(String promotionID) {
		this.promotionID = promotionID;
	}
	public int getTotalRewardAmount() {
		return totalRewardAmount;
	}
	public void setTotalRewardAmount(int totalRewardAmount) {
		this.totalRewardAmount = totalRewardAmount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRewardType() {
		return rewardType;
	}
	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}
	public String getPromotionDescription() {
		return promotionDescription;
	}
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	public String getTriggerTiming() {
		return triggerTiming;
	}
	public void setTriggerTiming(String triggerTiming) {
		this.triggerTiming = triggerTiming;
	}
	public int getRedemptionQuantity() {
		return redemptionQuantity;
	}
	public void setRedemptionQuantity(int redemptionQuantity) {
		this.redemptionQuantity = redemptionQuantity;
	}
    
    
}
