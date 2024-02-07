package com.dcode7.sharedutilities.pincode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pincode {

	public Pincode() {}

	public Pincode(Integer pinCode, String officeName, String officeType, String deliveryStatus, String divisionName,
			String regionName, String circleName, String taluk, String districtName, String stateName) {
		super();
		this.pinCode = pinCode;
		this.officeName = officeName;
		this.officeType = officeType;
		this.deliveryStatus = deliveryStatus;
		this.divisionName = divisionName;
		this.regionName = regionName;
		this.circleName = circleName;
		this.taluk = taluk;
		this.districtName = districtName;
		this.stateName = stateName;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private Integer pinCode;
	private String officeName;
	private String officeType;
	private String deliveryStatus;
	private String divisionName;
	private String regionName;
	private String circleName;
	private String taluk;
	private String districtName;
	private String stateName;
	
	public void setPinCode(Integer pincode) {
		this.pinCode = pincode;
	}
	
	public Integer getPinCode() {
		return pinCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public String getOfficeType() {
		return officeType;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public String getRegionName() {
		return regionName;
	}
	public String getCircleName() {
		return circleName;
	}
	public String getTaluk() {
		return taluk;
	}
	public String getDistrictName() {
		return districtName;
	}
	public String getStateName() {
		return stateName;
	}
}
