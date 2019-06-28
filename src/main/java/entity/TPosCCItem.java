package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "t_pos_cc_item")
@IdClass(TPosCCItemPK.class)
public class TPosCCItem {
	
	public String regionCode;
	public String outletCode;
	public String posCode;
	public double daySeq;
	public String ccNo;
	public String itemSeq;
	public String menuItemCode;
	public double itemQty;
	public double amount;
	public String transType;
	public String itemManagerCode;
	public Date transDate;
	public String userUPD;
	public Date dateUPD;
	public String timeUPD;
	public String syncFlag;
	public double amtTax;
	
	@Id
	@Column(name = "REGION_CODE")
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	
	@Id
	@Column(name = "OUTLET_CODE")
	public String getOutletCode() {
		return outletCode;
	}
	public void setOutletCode(String outletCode) {
		this.outletCode = outletCode;
	}
	
	@Id
	@Column(name = "POS_CODE")
	public String getPosCode() {
		return posCode;
	}
	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}
	
	@Id
	@Column(name = "DAY_SEQ")
	public double getDaySeq() {
		return daySeq;
	}
	public void setDaySeq(double daySeq) {
		this.daySeq = daySeq;
	}
	
	@Id
	@Column(name = "CC_NO")
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	
	@Id
	@Column(name = "ITEM_SEQ")
	public String getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(String itemSeq) {
		this.itemSeq = itemSeq;
	}
	
	@Column(name = "MENU_ITEM_CODE")
	public String getMenuItemCode() {
		return menuItemCode;
	}
	public void setMenuItemCode(String menuItemCode) {
		this.menuItemCode = menuItemCode;
	}
	
	@Column(name = "ITEM_QTY")
	public double getItemQty() {
		return itemQty;
	}
	public void setItemQty(double itemQty) {
		this.itemQty = itemQty;
	}
	
	@Column(name = "AMOUNT")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Column(name = "TRANS_TYPE")
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	@Column(name = "ITEM_MANAGER_CODE")
	public String getItemManagerCode() {
		return itemManagerCode;
	}
	public void setItemManagerCode(String itemManagerCode) {
		this.itemManagerCode = itemManagerCode;
	}
	
	@Column(name = "TRANS_CODE")
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	@Column(name = "USER_UPD")
	public String getUserUPD() {
		return userUPD;
	}
	public void setUserUPD(String userUPD) {
		this.userUPD = userUPD;
	}
	
	@Column(name = "DATE_UPD")
	public Date getDateUPD() {
		return dateUPD;
	}
	public void setDateUPD(Date dateUPD) {
		this.dateUPD = dateUPD;
	}
	
	@Column(name = "TIME_UPD")
	public String getTimeUPD() {
		return timeUPD;
	}
	public void setTimeUPD(String timeUPD) {
		this.timeUPD = timeUPD;
	}
	
	@Column(name = "SYNC_FLAG")
	public String getSyncFlag() {
		return syncFlag;
	}
	public void setSyncFlag(String syncFlag) {
		this.syncFlag = syncFlag;
	}
	
	@Column(name = "AMT_TAX")
	public double getAmtTax() {
		return amtTax;
	}
	public void setAmtTax(double amtTax) {
		this.amtTax = amtTax;
	}
	
	
}
