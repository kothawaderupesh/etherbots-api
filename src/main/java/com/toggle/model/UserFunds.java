package com.toggle.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserFunds {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_fund_id")
	private Integer userFundId;

	@Column(name="User_Name")
	private String userName;

	@Column(name="Fund")
	private String fund;

	@Column(name="Scheme")
	private String scheme;

	@Column(name="Category")
	private String category;

	@Column(name="Sub_Category")
	private String subCategory;

	@Column(name="Average_Cost_Price")
	private String averageCostPrice;

	@Column(name="Value_At_Cost")
	private String valueAtCost;

	@Column(name="Last_Recorded_NAV_On")
	private String lastRecordedNAVDate;

	@Column(name="Last_Recorded_NAV")
	private String lastRecordedNAV;

	@Column(name="Value_at_NAV")
	private String valueAtNAV;

	@Column(name="Profit_Loss")
	private String profitLoss;

	@Column(name="Research_Recommends")
	private String researchRecommends;

	@Column(name="unitsHeld")
	private String unitsHeld;

	@Column(name="RAting")
	private String rating;

	public Integer getUserFundId() {
		return userFundId;
	}
	public void setUserFundId(Integer schemeId) {
		this.userFundId = schemeId;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getAverageCostPrice() {
		return averageCostPrice;
	}
	public void setAverageCostPrice(String averageCostPrice) {
		this.averageCostPrice = averageCostPrice;
	}
	public String getValueAtCost() {
		return valueAtCost;
	}
	public void setValueAtCost(String valueAtCost) {
		this.valueAtCost = valueAtCost;
	}
	public String getLastRecordedNAVDate() {
		return lastRecordedNAVDate;
	}
	public void setLastRecordedNAVDate(String lastRecordedNAVDate) {
		this.lastRecordedNAVDate = lastRecordedNAVDate;
	}
	public String getLastRecordedNAV() {
		return lastRecordedNAV;
	}
	public void setLastRecordedNAV(String lastRecordedNAV) {
		this.lastRecordedNAV = lastRecordedNAV;
	}
	public String getValueAtNAV() {
		return valueAtNAV;
	}
	public void setValueAtNAV(String valueAtNAV) {
		this.valueAtNAV = valueAtNAV;
	}
	public String getProfitLoss() {
		return profitLoss;
	}
	public void setProfitLoss(String profitLoss) {
		this.profitLoss = profitLoss;
	}
	public String getResearchRecommends() {
		return researchRecommends;
	}
	public void setResearchRecommends(String researchRecommends) {
		this.researchRecommends = researchRecommends;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFund() {
		return fund;
	}
	public void setFund(String fund) {
		this.fund = fund;
	}
	public String getUnitsHeld() {
		return unitsHeld;
	}
	public void setUnitsHeld(String unitsHeld) {
		this.unitsHeld = unitsHeld;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}    


