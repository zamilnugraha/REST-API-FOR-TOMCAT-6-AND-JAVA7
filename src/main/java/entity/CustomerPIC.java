package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "m_customer_pic")
@IdClass(CustomerPICPK.class)
public class CustomerPIC {
	
	public String customerPhoneNo;
	public double custPicSeq;
	public String custPicName;
	public String custPicremark;
	public String userUPD;
	public Date dateUPD;
	public String timeUPD;
	public String syncFlag;
	
	@Column(name ="CUSTOMER_PHONE_NO")
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	
	@Id
	@Column(name = "SEQ_NO")
	public double getCustPicSeq() {
		return custPicSeq;
	}
	public void setCustPicSeq(double custPicSeq) {
		this.custPicSeq = custPicSeq;
	}
	
	@Column(name = "PIC_NAME")
	public String getCustPicName() {
		return custPicName;
	}
	public void setCustPicName(String custPicName) {
		this.custPicName = custPicName;
	}
	
	@Column(name = "REMARK")
	public String getCustPicremark() {
		return custPicremark;
	}
	public void setCustPicremark(String custPicremark) {
		this.custPicremark = custPicremark;
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
