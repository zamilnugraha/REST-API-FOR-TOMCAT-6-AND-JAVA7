package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "t_pos_bill")
@IdClass(TPosBillPK.class)
public class TPosBill {
	
	public String regionCode;
	public String outletCode;
	public String posCode;
	public String daySec;
	public String billNo;
	public String bookNo;
	public String ccNO;
	public String cateringNO;
	public String billJoint;
	public Date transDate;
	public Date billDate;
	public String billTime;
	public String shiftCode;
	public String orderType;
	public String transType;
	public String catReport;
	public String chasierCode;
	public String agentCode;
	public String vehicleNo;
	public String deliveryStatus;
	public String customerPhoneNo;
	public String customerMobilePhone;
	public String customerName;
	public double seqNo;
	public String address1;
	public String address2;
	public String address3;
	public String city;
	public String zipCode;
	public String notes;
	public String riderCode;
	public double totalCustomer;
	public double totalItem;
	public double totalAmount;
	public String discountMethodCode;
	public String discountManagerCode;
	public double percentage;
	public double totalDiscount;
	public double totalCharge;
	public double totalTax;
	public double totalRounding;
	public double totalSales;
	public String dpPaidManagerCode;
	public double totalDpPaid;
	public double totalPayment;
	public double change;
	public double excess;
	public double totalEstimatePayment;
	public String refundManagerCode;
	public String refundReasonCode;
	public double totalRefund;
	public String orderTime;
	public String packTime;
	public String packTimeStart;
	public String packTimeEnd;
	public String cashTime;
	public String delTimeStart;
	public String delTimeCustomer;
	public String delTimeEnd;
	public String flagOnline;
	public String userUPD;
	public Date dateUPD;
	public String timeUPD;
	public String syncFlag;
	public double totalDonation;
	public double totalTaxCharge;
	
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
	public String getDaySec() {
		return daySec;
	}
	public void setDaySec(String daySec) {
		this.daySec = daySec;
	}
	
	@Id
	@Column(name = "BILL_NO")
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	@Column(name = "BOOK_NO")
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	
	@Column(name = "CC_NO")
	public String getCcNO() {
		return ccNO;
	}
	public void setCcNO(String ccNO) {
		this.ccNO = ccNO;
	}
	
	@Column(name = "CATERING_NO")
	public String getCateringNO() {
		return cateringNO;
	}
	public void setCateringNO(String cateringNO) {
		this.cateringNO = cateringNO;
	}
	
	@Column(name = "BILL_JOINT")
	public String getBillJoint() {
		return billJoint;
	}
	public void setBillJoint(String billJoint) {
		this.billJoint = billJoint;
	}
	
	@Column(name = "TRANS_DATE")
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	@Column(name = "BILL_DATE")
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	@Column(name = "BILL_TIME")
	public String getBillTime() {
		return billTime;
	}
	public void setBillTime(String billTime) {
		this.billTime = billTime;
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
	
	@Column(name = "TRANS_TYPE")
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	@Column(name = "CAT_REPORT")
	public String getCatReport() {
		return catReport;
	}
	public void setCatReport(String catReport) {
		this.catReport = catReport;
	}
	
	@Column(name = "CHASIER_CODE")
	public String getChasierCode() {
		return chasierCode;
	}
	public void setChasierCode(String chasierCode) {
		this.chasierCode = chasierCode;
	}
	
	@Column(name = "AGENT_CODE")
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	@Column(name = "VEHICLE_NO")
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
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
	
	@Column(name = "ADDRESS_1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Column(name = "ADDRESS_2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Column(name = "ADDRESS_3")
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
	
	@Column(name = "RIDER_CODE")
	public String getRiderCode() {
		return riderCode;
	}
	public void setRiderCode(String riderCode) {
		this.riderCode = riderCode;
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
	
	@Column(name = "DISCOUNT_METHOD_CODE")
	public String getDiscountMethodCode() {
		return discountMethodCode;
	}
	public void setDiscountMethodCode(String discountMethodCode) {
		this.discountMethodCode = discountMethodCode;
	}
	
	@Column(name = "DISCOUNT_MANAGER_CODE")
	public String getDiscountManagerCode() {
		return discountManagerCode;
	}
	public void setDiscountManagerCode(String discountManagerCode) {
		this.discountManagerCode = discountManagerCode;
	}
	
	@Column(name = "PERCENTAGE")
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Column(name = "TOTAL_DISCOUNT")
	public double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	
	@Column(name = "TOTAL_CHARGE")
	public double getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
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
	
	@Column(name = "DP_PAID_MANAGER_CODE")
	public String getDpPaidManagerCode() {
		return dpPaidManagerCode;
	}
	public void setDpPaidManagerCode(String dpPaidManagerCode) {
		this.dpPaidManagerCode = dpPaidManagerCode;
	}
	
	@Column(name = "TOTAL_DP_PAID")
	public double getTotalDpPaid() {
		return totalDpPaid;
	}
	public void setTotalDpPaid(double totalDpPaid) {
		this.totalDpPaid = totalDpPaid;
	}
	
	@Column(name = "TOTAL_PAYMENT")
	public double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	@Column(name = "CHANGE")
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	@Column(name = "EXCESS")
	public double getExcess() {
		return excess;
	}
	public void setExcess(double excess) {
		this.excess = excess;
	}
	
	@Column(name = "TOTAL_ESTIMATE_PAYMENT")
	public double getTotalEstimatePayment() {
		return totalEstimatePayment;
	}
	public void setTotalEstimatePayment(double totalEstimatePayment) {
		this.totalEstimatePayment = totalEstimatePayment;
	}
	
	@Column(name = "REFUND_MANAGER_CODE")
	public String getRefundManagerCode() {
		return refundManagerCode;
	}
	public void setRefundManagerCode(String refundManagerCode) {
		this.refundManagerCode = refundManagerCode;
	}
	
	@Column(name = "REFUND_REASON_CODE")
	public String getRefundReasonCode() {
		return refundReasonCode;
	}
	public void setRefundReasonCode(String refundReasonCode) {
		this.refundReasonCode = refundReasonCode;
	}
	
	@Column(name = "TOTAL_REFUND")
	public double getTotalRefund() {
		return totalRefund;
	}
	public void setTotalRefund(double totalRefund) {
		this.totalRefund = totalRefund;
	}
	
	@Column(name = "ORDER_TIME")
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	@Column(name = "PACK_TIME")
	public String getPackTime() {
		return packTime;
	}
	public void setPackTime(String packTime) {
		this.packTime = packTime;
	}
	
	@Column(name = "PACK_TIME_START")
	public String getPackTimeStart() {
		return packTimeStart;
	}
	public void setPackTimeStart(String packTimeStart) {
		this.packTimeStart = packTimeStart;
	}
	
	@Column(name = "PACK_TIME_END")
	public String getPackTimeEnd() {
		return packTimeEnd;
	}
	public void setPackTimeEnd(String packTimeEnd) {
		this.packTimeEnd = packTimeEnd;
	}
	
	@Column(name = "CASH_TIME")
	public String getCashTime() {
		return cashTime;
	}
	public void setCashTime(String cashTime) {
		this.cashTime = cashTime;
	}
	
	@Column(name = "DEL_TIME_START")
	public String getDelTimeStart() {
		return delTimeStart;
	}
	public void setDelTimeStart(String delTimeStart) {
		this.delTimeStart = delTimeStart;
	}
	
	@Column(name = "DEL_TIME_CUSTOMER")
	public String getDelTimeCustomer() {
		return delTimeCustomer;
	}
	public void setDelTimeCustomer(String delTimeCustomer) {
		this.delTimeCustomer = delTimeCustomer;
	}
	
	@Column(name = "DEL_TIME_END")
	public String getDelTimeEnd() {
		return delTimeEnd;
	}
	public void setDelTimeEnd(String delTimeEnd) {
		this.delTimeEnd = delTimeEnd;
	}
	
	@Column(name = "FLAG_ONLINE")
	public String getFlagOnline() {
		return flagOnline;
	}
	public void setFlagOnline(String flagOnline) {
		this.flagOnline = flagOnline;
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
	
	@Column(name = "TOTAL_DONATION")
	public double getTotalDonation() {
		return totalDonation;
	}
	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}
	
	@Column(name = "TOTAL_TAX_CHAGE")
	public double getTotalTaxCharge() {
		return totalTaxCharge;
	}
	public void setTotalTaxCharge(double totalTaxCharge) {
		this.totalTaxCharge = totalTaxCharge;
	}
	
	
}
