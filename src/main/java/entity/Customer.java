package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "m_customer")
@IdClass(CustomerPK.class)
public class Customer {
	
	public String regionCode;
	public String outletCode;
	public String custPhoneNumber;
	public String custMobileNumber;
	public String custName;
	public double custSeqNo;
	public String custAddress1;
	public String custAddress2;
	public String custAddress3;
	public String custCity;
	public String custZipCode;
	public String custNotes;
	public String custArea;
	public String custLastBillNo;
	public double custOrderFreq;
	public String custStatus;
	public String custUserUPD;
	public Date custDateUPD;
	public String custTimeUPD;
	public String custSyncFlag;
	public String custGiftFlag;
	
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
	@Column(name = "CUSTOMER_PHONE_NO")
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}
	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}
	
	@Column(name = "CUSTOMER_MOBILE_PHONE")
	public String getCustMobileNumber() {
		return custMobileNumber;
	}
	public void setCustMobileNumber(String custMobileNumber) {
		this.custMobileNumber = custMobileNumber;
	}
	
	@Column(name = "CUSTOMER_NAME")
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Column(name = "SEQ_NO")
	public double getCustSeqNo() {
		return custSeqNo;
	}
	public void setCustSeqNo(double custSeqNo) {
		this.custSeqNo = custSeqNo;
	}
	
	@Column(name = "ADDRESS_1")
	public String getCustAddress1() {
		return custAddress1;
	}
	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}
	
	@Column(name = "ADDRESS_2")
	public String getCustAddress2() {
		return custAddress2;
	}
	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}
	
	@Column(name = "ADDRESS_3")
	public String getCustAddress3() {
		return custAddress3;
	}
	public void setCustAddress3(String custAddress3) {
		this.custAddress3 = custAddress3;
	}
	
	@Column(name = "CITY")
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	@Column(name = "ZIP_CODE")
	public String getCustZipCode() {
		return custZipCode;
	}
	public void setCustZipCode(String custZipCode) {
		this.custZipCode = custZipCode;
	}
	
	@Column(name = "NOTES")
	public String getCustNotes() {
		return custNotes;
	}
	public void setCustNotes(String custNotes) {
		this.custNotes = custNotes;
	}
	
	@Column(name = "AREA")
	public String getCustArea() {
		return custArea;
	}
	public void setCustArea(String custArea) {
		this.custArea = custArea;
	}
	
	@Column(name = ";LAST_BILL_NO")
	public String getCustLastBillNo() {
		return custLastBillNo;
	}
	public void setCustLastBillNo(String custLastBillNo) {
		this.custLastBillNo = custLastBillNo;
	}
	
	@Column(name = "ORDER_FREG")
	public double getCustOrderFreq() {
		return custOrderFreq;
	}
	public void setCustOrderFreq(double custOrderFreq) {
		this.custOrderFreq = custOrderFreq;
	}
	
	@Column(name = "STATUS")
	public String getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	
	@Column(name = "USER_UPD")
	public String getCustUserUPD() {
		return custUserUPD;
	}
	public void setCustUserUPD(String custUserUPD) {
		this.custUserUPD = custUserUPD;
	}
	
	@Column(name = "DATE_UPD")
	public Date getCustDateUPD() {
		return custDateUPD;
	}
	public void setCustDateUPD(Date custDateUPD) {
		this.custDateUPD = custDateUPD;
	}
	
	@Column(name = "TIME_UPD")
	public String getCustTimeUPD() {
		return custTimeUPD;
	}
	public void setCustTimeUPD(String custTimeUPD) {
		this.custTimeUPD = custTimeUPD;
	}
	
	@Column(name = "SYNC_FLAG")
	public String getCustSyncFlag() {
		return custSyncFlag;
	}
	public void setCustSyncFlag(String custSyncFlag) {
		this.custSyncFlag = custSyncFlag;
	}
	
	@Column(name = "GIFT_FLAG")
	public String getCustGiftFlag() {
		return custGiftFlag;
	}
	public void setCustGiftFlag(String custGiftFlag) {
		this.custGiftFlag = custGiftFlag;
	}
	
}
