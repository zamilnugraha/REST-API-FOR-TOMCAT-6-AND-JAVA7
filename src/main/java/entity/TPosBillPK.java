package entity;

import java.io.Serializable;

public class TPosBillPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regionCode;
	private String outletCode;
	private String posCode;
	private String daySec;
	private String billNo;
	
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
	public String getPosCode() {
		return posCode;
	}
	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}
	public String getDaySec() {
		return daySec;
	}
	public void setDaySec(String daySec) {
		this.daySec = daySec;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	
	
}
