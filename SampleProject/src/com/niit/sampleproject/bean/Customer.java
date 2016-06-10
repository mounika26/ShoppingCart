package com.niit.sampleproject.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User { 
	private  List myAccounts=new ArrayList();
	private String ShippingAddress;
	private String PermanentAddress;
	public List getMyAccounts() {
		return myAccounts;
	}
	public void setMyAccounts(List myAccounts) {
		this.myAccounts = myAccounts;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public String getPermanentAddress() {
		return PermanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}
	
	

}
