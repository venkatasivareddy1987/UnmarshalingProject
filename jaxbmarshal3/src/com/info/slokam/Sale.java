package com.info.slokam;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sale {
	@JsonProperty("RegularSalesUnitPrice")
	public RegularSalesUnitPrice regularSalesUnitPrice;
	@JsonProperty("ItemUomData")
	public ItemUomData itemUomData;
	@JsonProperty("Description")
	public List<Description> description;
	@JsonProperty("POSIdentity")
	public POSIdentity pOSIdentity;
	@JsonProperty("MerchandiseHierarchy")
	public List<MerchandiseHierarchy> merchandiseHierarchy;
	@JsonProperty("Quantity")
	public Quantity quantity;
	@JsonProperty("ConsumableGroup")
	public List<ConsumableGroup> consumableGroup;
	@JsonProperty("ActualSalesUnitPrice")
	public ActualSalesUnitPrice actualSalesUnitPrice;
	@JsonProperty("ExtendedAmount")
	public ExtendedAmount extendedAmount;
	@JsonProperty("GroupIndicator")
	public GroupIndicator groupIndicator;
	@JsonProperty("ItemID")
	public ItemID itemID;
	public RegularSalesUnitPrice getRegularSalesUnitPrice() {
		return regularSalesUnitPrice;
	}
	public void setRegularSalesUnitPrice(RegularSalesUnitPrice regularSalesUnitPrice) {
		this.regularSalesUnitPrice = regularSalesUnitPrice;
	}
	public ItemUomData getItemUomData() {
		return itemUomData;
	}
	public void setItemUomData(ItemUomData itemUomData) {
		this.itemUomData = itemUomData;
	}
	public List<Description> getDescription() {
		return description;
	}
	public void setDescription(List<Description> description) {
		this.description = description;
	}
	public POSIdentity getpOSIdentity() {
		return pOSIdentity;
	}
	public void setpOSIdentity(POSIdentity pOSIdentity) {
		this.pOSIdentity = pOSIdentity;
	}
	public List<MerchandiseHierarchy> getMerchandiseHierarchy() {
		return merchandiseHierarchy;
	}
	public void setMerchandiseHierarchy(List<MerchandiseHierarchy> merchandiseHierarchy) {
		this.merchandiseHierarchy = merchandiseHierarchy;
	}
	public Quantity getQuantity() {
		return quantity;
	}
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	public List<ConsumableGroup> getConsumableGroup() {
		return consumableGroup;
	}
	public void setConsumableGroup(List<ConsumableGroup> consumableGroup) {
		this.consumableGroup = consumableGroup;
	}
	public ActualSalesUnitPrice getActualSalesUnitPrice() {
		return actualSalesUnitPrice;
	}
	public void setActualSalesUnitPrice(ActualSalesUnitPrice actualSalesUnitPrice) {
		this.actualSalesUnitPrice = actualSalesUnitPrice;
	}
	public ExtendedAmount getExtendedAmount() {
		return extendedAmount;
	}
	public void setExtendedAmount(ExtendedAmount extendedAmount) {
		this.extendedAmount = extendedAmount;
	}
	public GroupIndicator getGroupIndicator() {
		return groupIndicator;
	}
	public void setGroupIndicator(GroupIndicator groupIndicator) {
		this.groupIndicator = groupIndicator;
	}
	public ItemID getItemID() {
		return itemID;
	}
	public void setItemID(ItemID itemID) {
		this.itemID = itemID;
	}
	
	
}
