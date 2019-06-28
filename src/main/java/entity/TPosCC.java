package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "t_pos_cc")
@IdClass(TPosCCPK.class)
public class TPosCC {
	public String regionCode;
	public String outletCode;
	public String posCode;
	public double daySec;
	public String ccNo;
	public Date transDate;
	public Date ccDate;
	public String ccTime;
	public String shiftCode;
	public String orderType;
	public String agentCode;
	public String deliveryStatus;
	public String customerPhoneNo;
	public String customerMobilePhone;
	public String customerName;
	public double seqNo;
	public String picName;
	public String remark;
	public String address1;
	public String address2;
	public String address3;
	public String city;
	public String zipCode;
	public String notes;
	public double totalCustomer;
	public double totalItem;
	public double totalAmount;
	public double totalCharge;
	public double totalTaxCharge;
	public double totalTax;
	public double totalRounding;
	public double totalSales;
	public double totalPayment;
	public String flagOnline;
	public String flagStatus;
	public String userUPD;
	public Date dateUPD;
	public String timeUPD;
	public String syncFlag;
	
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
	@Column(name = "DAY_SEC")
	public double getDaySec() {
		return daySec;
	}
	public void setDaySec(double daySec) {
		this.daySec = daySec;
	}
	
	@Id
	@Column(name = "CC_NO")
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	
	@Column(name = "TRANS_DATE")
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	@Column(name = "CC_DATE")
	public Date getCcDate() {
		return ccDate;
	}
	public void setCcDate(Date ccDate) {
		this.ccDate = ccDate;
	}
	
	@Column(name = "CC_TIME")
	public String getCcTime() {
		return ccTime;
	}
	public void setCcTime(String ccTime) {
		this.ccTime = ccTime;
	}
	
	@Column(name = "SHIFT_CODE")
	public String getShiftCode() {
		return shiftCode;
	}
	public void setShiftCode(String shiftCode) {
		this.shiftCode = shiftCode;
	}
	
	@Column(name = "ORDER_TYPE")
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	@Column(name = "AGENT_CODE")
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	@Column(name = "DELIVERY_STATUS")
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	@Column(name = "CUSTOMER_PHONE_NO")
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	
	@Column(name = "CUSTOMER_MOBILE_PHONE")
	public String getCustomerMobilePhone() {
		return customerMobilePhone;
	}
	public void setCustomerMobilePhone(String customerMobilePhone) {
		this.customerMobilePhone = customerMobilePhone;
	}
	
	@Column(name = "CUSTOMER_NAME")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(name = "SEQ_NO")
	public double getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(double seqNo) {
		this.seqNo = seqNo;
	}
	
	@Column(name = "PIC_NAME")
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	
	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Column(name = "ADDRESS1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Column(name = "ADDRESS2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Column(name = "ADDRESS3")
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "ZIP_CODE")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Column(name = "NOTES")
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Column(name = "TOTAL_CUSTOMER")
	public double getTotalCustomer() {
		return totalCustomer;
	}
	public void setTotalCustomer(double totalCustomer) {
		this.totalCustomer = totalCustomer;
	}
	
	@Column(name = "TOTAL_ITEM")
	public double getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem;
	}
	
	@Column(name = "TOTAL_AMOUNT")
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Column(name = "TOTAL_CHARGE")
	public double getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}
	
	@Column(name = "TOTAL_TAX_CHARGE")
	public double getTotalTaxCharge() {
		return totalTaxCharge;
	}
	public void setTotalTaxCharge(double totalTaxCharge) {
		this.totalTaxCharge = totalTaxCharge;
	}
	
	@Column(name = "TOTAL_TAX")
	public double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	
	@Column(name = "TOTAL_ROUNDING")
	public double getTotalRounding() {
		return totalRounding;
	}
	public void setTotalRounding(double totalRounding) {
		this.totalRounding = totalRounding;
	}
	
	@Column(name = "TOTAL_SALES")
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	@Column(name = "TOTAL_PAYMENT")
	public double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	@Column(name = "FLAG_ONLINE")
	public String getFlagOnline() {
		return flagOnline;
	}
	public void setFlagOnline(String flagOnline) {
		this.flagOnline = flagOnline;
	}
	
	@Column(name = "FLAG_STATUS")
	public String getFlagStatus() {
		return flagStatus;
	}
	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
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
}
