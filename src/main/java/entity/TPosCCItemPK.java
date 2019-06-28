package entity;

import java.io.Serializable;

public class TPosCCItemPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regionCode;
	private String outletCode;
	private String posCode;
	private String daySeq;
	private String ccNo;
	private String itemSeq;
	
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
	public String getDaySeq() {
		return daySeq;
	}
	public void setDaySeq(String daySeq) {
		this.daySeq = daySeq;
	}
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	public String getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(String itemSeq) {
		this.itemSeq = itemSeq;
	}
	

}
