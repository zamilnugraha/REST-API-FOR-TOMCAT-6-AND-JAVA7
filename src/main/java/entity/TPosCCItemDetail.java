package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "t_pos_cc_item_detail")
@IdClass(TPosCCItemDetailPK.class)
public class TPosCCItemDetail {

	public String regionCode;
	public String outletCode;
	public String posCode;
	public double daySeq;
	public String ccNo;
	public double itemSeq;
	public double itemDetailSeq;
	public String menuItemCode;
	public double itemQty;
	public double amount;
	public String itemType;
	public String originalItemCode;
	public String modifierGroupCode;
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
	public double getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(double itemSeq) {
		this.itemSeq = itemSeq;
	}
	
	@Id
	@Column(name = "ITEM_SEQ_DETAIL")
	public double getItemDetailSeq() {
		return itemDetailSeq;
	}
	public void setItemDetailSeq(double itemDetailSeq) {
		this.itemDetailSeq = itemDetailSeq;
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
	
	@Column(name = "ITEM_TYPE")
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	@Column(name = "ORIGINAL_ITEM_CODE")
	public String getOriginalItemCode() {
		return originalItemCode;
	}
	public void setOriginalItemCode(String originalItemCode) {
		this.originalItemCode = originalItemCode;
	}
	
	@Column(name = "MODIFIER_GROUP_CODE")
	public String getModifierGroupCode() {
		return modifierGroupCode;
	}
	public void setModifierGroupCode(String modifierGroupCode) {
		this.modifierGroupCode = modifierGroupCode;
	}
	
	@Column(name = "TRANS_DATE")
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
