package entity;

import java.io.Serializable;

public class CustomerPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String custPhoneNumber;
	private String outletCode;
	
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}
	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}
	public String getOutletCode() {
		return outletCode;
	}
	public void setOutletCode(String outletCode) {
		this.outletCode = outletCode;
	}
	
	
}
