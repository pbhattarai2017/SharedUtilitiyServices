package com.dcode7.sharedutilities.ifsc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Ifsc {

	@Id
	private String code;

	@NotNull
	private String bank;
	
	private String branch;
	
	private String centre; 

	private String district;
	
	private String state;
	
	private String address;
	
	private String contact;
	
	private boolean imps;
	
	private boolean rtgs;
	
	private String city;
	
	private String iso3166;
	
	private boolean neft;
	
	private String micr;
	
	private boolean upi;
	
	private String swift;

	public Ifsc(String code, @NotNull String bank, String branch, String centre, String district, String state, String address,
			String contact, boolean imps, boolean rtgs, String city, String iso3166, boolean neft, String micr,
			boolean upi, String swift) {
		super();
		this.code = code;
		this.bank = bank;
		this.branch = branch;
		this.centre = centre;
		this.district = district;
		this.state = state;
		this.address = address;
		this.contact = contact;
		this.imps = imps;
		this.rtgs = rtgs;
		this.city = city;
		this.iso3166 = iso3166;
		this.neft = neft;
		this.micr = micr;
		this.upi = upi;
		this.swift = swift;
	}

	public Ifsc() {
		super();
	}

	public String getCode() {
		return code;
	}

	public String getBank() {
		return bank;
	}

	public String getBranch() {
		return branch;
	}

	public String getCentre() {
		return centre;
	}

	public String getDistrict() {
		return district;
	}

	public String getState() {
		return state;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public boolean isImps() {
		return imps;
	}

	public boolean isRtgs() {
		return rtgs;
	}

	public String getCity() {
		return city;
	}

	public String getIso3166() {
		return iso3166;
	}

	public boolean isNeft() {
		return neft;
	}

	public String getMicr() {
		return micr;
	}

	public boolean isUpi() {
		return upi;
	}

	public String getSwift() {
		return swift;
	}
	
}
