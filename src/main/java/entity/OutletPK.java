package entity;

import java.io.Serializable;

public class OutletPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regionCode;
	private String outletCode;
	
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getOutletCode() {
		return outletCode;
	}
	public void setOutletCode(String outletCode) {
		this.outletCode = outletCode;
	}
	

}
