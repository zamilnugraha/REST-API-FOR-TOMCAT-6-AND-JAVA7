package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "m_outlet")
@IdClass(OutletPK.class)
public class Outlet {
	
	public String regionCode;
	public String outletCode;
	public String outletName;
	public String type;
	public String address1;
	public String address2;
	public String city;
	public String postCode;
	public String phone;
	public String fax;
	public double cashBalance;
	public Date transDate;
	public double delLimit;
	public double delCharge;
	public String rndPrint;
	public double rndFact;
	public double rndLimit;
	public double tax;
	public double dpMin;
	public double cancelFee;
	public double catItems;
	public double maxBills;
	public double minItems;
	public double refItem;
	public double timeOut;
	public double maxShift;
	public String sendData;
	public double minPullTrx;
	public double maxFullValue;
	public String status;
	public Date startDate;
	public Date finishDate;
	public double maxDiscPercent;
	public double maxDiscAmount;
	public String openTime;
	public String closeTime;
	public double refundTimeLimit;
	public String monDay;
	public String tuesDay;
	public String wednesDay;
	public String thursDay;
	public String friDay;
	public String saturDay;
	public String sunDay;
	public String holiDay;
	public String outlet24Hour;
	public String ipOutlet;
	public String portOutlet;
	public String userUPD;
	public Date dateUPD;
	public String timeUPD;
	public String ftpADDR;
	public String ftpUser;
	public String ftpPassword;
	public String initialOutlet;
	public String areaCode;
	public String rscCode;
	public double taxCharge;
	
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
	
	@Column(name = "OUTLET_NAME")
	public String getOutletName() {
		return outletName;
	}
	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}
	
	@Column(name = "TYPE")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "POST_CODE")
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "FAX")
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name = "CASH_BALANCE")
	public double getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}
	
	@Column(name = "TRANS_DATE")
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	@Column(name = "DEL_LIMIT")
	public double getDelLimit() {
		return delLimit;
	}
	public void setDelLimit(double delLimit) {
		this.delLimit = delLimit;
	}
	
	@Column(name = "DEL_CHARGE")
	public double getDelCharge() {
		return delCharge;
	}
	public void setDelCharge(double delCharge) {
		this.delCharge = delCharge;
	}
	
	@Column(name = "RND_PRINT")
	public String getRndPrint() {
		return rndPrint;
	}
	public void setRndPrint(String rndPrint) {
		this.rndPrint = rndPrint;
	}
	
	@Column(name = "RND_FACT")
	public double getRndFact() {
		return rndFact;
	}
	public void setRndFact(double rndFact) {
		this.rndFact = rndFact;
	}
	
	@Column(name = "RND_LIMIT")
	public double getRndLimit() {
		return rndLimit;
	}
	public void setRndLimit(double rndLimit) {
		this.rndLimit = rndLimit;
	}
	
	@Column(name = "TAX")
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Column(name = "DP_MIN")
	public double getDpMin() {
		return dpMin;
	}
	public void setDpMin(double dpMin) {
		this.dpMin = dpMin;
	}
	
	@Column(name = "CANCEL_FEE")
	public double getCancelFee() {
		return cancelFee;
	}
	public void setCancelFee(double cancelFee) {
		this.cancelFee = cancelFee;
	}
	
	@Column(name = "CAT_ITEMS")
	public double getCatItems() {
		return catItems;
	}
	public void setCatItems(double catItems) {
		this.catItems = catItems;
	}
	
	@Column(name = "MAX_BILLS")
	public double getMaxBills() {
		return maxBills;
	}
	public void setMaxBills(double maxBills) {
		this.maxBills = maxBills;
	}
	
	@Column(name = "MIN_ITEMS")
	public double getMinItems() {
		return minItems;
	}
	public void setMinItems(double minItems) {
		this.minItems = minItems;
	}
	
	@Column(name = "REF_ITEM")
	public double getRefItem() {
		return refItem;
	}
	public void setRefItem(double refItem) {
		this.refItem = refItem;
	}
	
	@Column(name = "TIME_OUT")
	public double getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(double timeOut) {
		this.timeOut = timeOut;
	}
	
	@Column(name = "MAX_SHIFT")
	public double getMaxShift() {
		return maxShift;
	}
	public void setMaxShift(double maxShift) {
		this.maxShift = maxShift;
	}
	
	@Column(name = "SEND_DATA")
	public String getSendData() {
		return sendData;
	}
	public void setSendData(String sendData) {
		this.sendData = sendData;
	}
	
	@Column(name = "MIN_PULL_TRX")
	public double getMinPullTrx() {
		return minPullTrx;
	}
	public void setMinPullTrx(double minPullTrx) {
		this.minPullTrx = minPullTrx;
	}
	
	@Column(name = "MAX_PULL_VALUE")
	public double getMaxFullValue() {
		return maxFullValue;
	}
	public void setMaxFullValue(double maxFullValue) {
		this.maxFullValue = maxFullValue;
	}
	
	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "START_DATE")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@Column(name = "FINISH_DATE")
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	@Column(name = "MAX_DISC_PERCENT")
	public double getMaxDiscPercent() {
		return maxDiscPercent;
	}
	public void setMaxDiscPercent(double maxDiscPercent) {
		this.maxDiscPercent = maxDiscPercent;
	}
	
	@Column(name = "MAX_DISC_AMOUNT")
	public double getMaxDiscAmount() {
		return maxDiscAmount;
	}
	public void setMaxDiscAmount(double maxDiscAmount) {
		this.maxDiscAmount = maxDiscAmount;
	}
	
	@Column(name = "OPEN_TIME")
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
	@Column(name = "CLOSE_TIME")
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	@Column(name = "REFUND_TIME_LIMIT")
	public double getRefundTimeLimit() {
		return refundTimeLimit;
	}
	public void setRefundTimeLimit(double refundTimeLimit) {
		this.refundTimeLimit = refundTimeLimit;
	}
	
	@Column(name = "MONDAY")
	public String getMonDay() {
		return monDay;
	}
	public void setMonDay(String monDay) {
		this.monDay = monDay;
	}
	
	@Column(name = "TUESDAY")
	public String getTuesDay() {
		return tuesDay;
	}
	public void setTuesDay(String tuesDay) {
		this.tuesDay = tuesDay;
	}
	
	@Column(name = "WEDNESDAY")
	public String getWednesDay() {
		return wednesDay;
	}
	public void setWednesDay(String wednesDay) {
		this.wednesDay = wednesDay;
	}
	
	@Column(name = "THURSDAY")
	public String getThursDay() {
		return thursDay;
	}
	public void setThursDay(String thursDay) {
		this.thursDay = thursDay;
	}
	
	@Column(name = "FRIDAY")
	public String getFriDay() {
		return friDay;
	}
	public void setFriDay(String friDay) {
		this.friDay = friDay;
	}
	
	@Column(name = "SATURDAY")
	public String getSaturDay() {
		return saturDay;
	}
	public void setSaturDay(String saturDay) {
		this.saturDay = saturDay;
	}
	
	@Column(name = "SUNDAY")
	public String getSunDay() {
		return sunDay;
	}
	public void setSunDay(String sunDay) {
		this.sunDay = sunDay;
	}
	
	@Column(name = "HOLIDAY")
	public String getHoliDay() {
		return holiDay;
	}
	public void setHoliDay(String holiDay) {
		this.holiDay = holiDay;
	}
	
	@Column(name = "OUTLET_24_HOUR")
	public String getOutlet24Hour() {
		return outlet24Hour;
	}
	public void setOutlet24Hour(String outlet24Hour) {
		this.outlet24Hour = outlet24Hour;
	}
	
	@Column(name = "IP_OUTLET")
	public String getIpOutlet() {
		return ipOutlet;
	}
	public void setIpOutlet(String ipOutlet) {
		this.ipOutlet = ipOutlet;
	}
	
	@Column(name = "PORT_OUTLET")
	public String getPortOutlet() {
		return portOutlet;
	}
	public void setPortOutlet(String portOutlet) {
		this.portOutlet = portOutlet;
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
	
	@Column(name = "FTP_ADDR")
	public String getFtpADDR() {
		return ftpADDR;
	}
	public void setFtpADDR(String ftpADDR) {
		this.ftpADDR = ftpADDR;
	}
	
	@Column(name = "FTP_USER")
	public String getFtpUser() {
		return ftpUser;
	}
	public void setFtpUser(String ftpUser) {
		this.ftpUser = ftpUser;
	}
	
	@Column(name = "FTP_PASSWORD")
	public String getFtpPassword() {
		return ftpPassword;
	}
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}
	
	@Column(name = "INITIAL_OUTLET")
	public String getInitialOutlet() {
		return initialOutlet;
	}
	public void setInitialOutlet(String initialOutlet) {
		this.initialOutlet = initialOutlet;
	}
	
	@Column(name = "AREA_CODE")
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	@Column(name = "RSC_CODE")
	public String getRscCode() {
		return rscCode;
	}
	public void setRscCode(String rscCode) {
		this.rscCode = rscCode;
	}
	
	@Column(name = "TAX_CHARGE")
	public double getTaxCharge() {
		return taxCharge;
	}
	public void setTaxCharge(double taxCharge) {
		this.taxCharge = taxCharge;
	}
		
}
