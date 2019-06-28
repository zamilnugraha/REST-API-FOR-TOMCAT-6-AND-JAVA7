package entity;

import java.io.Serializable;

public class TPosCCItemDetailPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regionCode;
	private String outletCode;
	private String posCode;
	private double daySeq;
	private String ccNo;
	private double itemSeq;
	private double itemDetailSeq;
	
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
	public double getDaySeq() {
		return daySeq;
	}
	public void setDaySeq(double daySeq) {
		this.daySeq = daySeq;
	}
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	public double getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(double itemSeq) {
		this.itemSeq = itemSeq;
	}
	public double getItemDetailSeq() {
		return itemDetailSeq;
	}
	public void setItemDetailSeq(double itemDetailSeq) {
		this.itemDetailSeq = itemDetailSeq;
	}
	
	
	
}
