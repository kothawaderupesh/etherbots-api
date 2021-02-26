package com.toggle.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_id")
    private Integer userId;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="occupation")
    private String occupation;
    
    @Column(name="job_security")
    private String jobSecurity;
    
    @Column(name="years_to_retire")
    private String yearsToRetire;
    
    @Column(name="saving")
    private String saving;
    
    @Column(name="dependents")
    private String dependents;
    
    @Column(name="family_income")
    private String familyIncome;
    
    @Column(name="invest_preference")
    private String investPreference;
    
    @Column(name="invest_exp")
    private String investExperience;
    
    @Column(name="risk_apetite")
    private String riskApetite;
    
    @Column(name="risk_strategy")
    private String riskStrategy;
    
    @Column(name="react_to_crisis")
    private String reactToCrisis;
    
    @Column(name="loss_apetite")
    private String lossApetite;
    
    @Column(name="risk_taker")
    private String riskTaker;
    
    @Column(name="db_invest")
    private String dbInvest;
    
    
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getJobSecurity() {
		return jobSecurity;
	}
	public void setJobSecurity(String jobSecurity) {
		this.jobSecurity = jobSecurity;
	}
	public String getYearsToRetire() {
		return yearsToRetire;
	}
	public void setYearsToRetire(String yearsToRetire) {
		this.yearsToRetire = yearsToRetire;
	}
	public String getSaving() {
		return saving;
	}
	public void setSaving(String saving) {
		this.saving = saving;
	}
	public String getDependents() {
		return dependents;
	}
	public void setDependents(String dependents) {
		this.dependents = dependents;
	}
	public String getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}
	public String getInvestPreference() {
		return investPreference;
	}
	public void setInvestPreference(String investPreference) {
		this.investPreference = investPreference;
	}
	public String getInvestExperience() {
		return investExperience;
	}
	public void setInvestExperience(String investExperience) {
		this.investExperience = investExperience;
	}
	public String getRiskApetite() {
		return riskApetite;
	}
	public void setRiskApetite(String riskApetite) {
		this.riskApetite = riskApetite;
	}
	public String getRiskStrategy() {
		return riskStrategy;
	}
	public void setRiskStrategy(String riskStrategy) {
		this.riskStrategy = riskStrategy;
	}
	public String getReactToCrisis() {
		return reactToCrisis;
	}
	public void setReactToCrisis(String reactToCrisis) {
		this.reactToCrisis = reactToCrisis;
	}
	public String getLossApetite() {
		return lossApetite;
	}
	public void setLossApetite(String lossApetite) {
		this.lossApetite = lossApetite;
	}
	public String getRiskTaker() {
		return riskTaker;
	}
	public void setRiskTaker(String riskTaker) {
		this.riskTaker = riskTaker;
	}
	public String getDbInvest() {
		return dbInvest;
	}
	public void setDbInvest(String dbInvest) {
		this.dbInvest = dbInvest;
	}
    
    

}