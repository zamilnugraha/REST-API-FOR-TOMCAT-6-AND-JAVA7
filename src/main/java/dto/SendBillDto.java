package dto;
/**
*
* @author Indocyber Global Teknologi/IGLO KFC Team ( Zamil Nugraha )
*/

import java.io.Serializable;
import java.util.List;
public class SendBillDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Outlet outlet;	
    public Customer customer;	
    public CustomerPIC customerPIC;
    public DataBill dataBill;
    public List<DataPayment> dataPayment;
    
	public Outlet getOutlet() {
		return outlet;
	}
	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerPIC getCustomerPIC() {
		return customerPIC;
	}
	public void setCustomerPIC(CustomerPIC customerPIC) {
		this.customerPIC = customerPIC;
	}
	public DataBill getDataBill() {
		return dataBill;
	}
	public void setDataBill(DataBill dataBill) {
		this.dataBill = dataBill;
	}
	public List<DataPayment> getDataPayment() {
		return dataPayment;
	}
	public void setDataPayment(List<DataPayment> dataPayment) {
		this.dataPayment = dataPayment;
	}
    
	public class Outlet{
	    public String regionCode;
	    public String outletCode;
	    
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
	}
	
	public class Customer {
	    public String custPhoneNumber;
	    public String custMobileNumber;
	    public String custName;
	    public String custAddress1;
	    public String custAddress2;
	    public String custAddress3;
	    public String custCity;
	    public String custZipCode;
	    public String custNotes;
	    public String custArea;
	    public String custStatus;
	    
		public String getCustPhoneNumber() {
			return custPhoneNumber;
		}
		public void setCustPhoneNumber(String custPhoneNumber) {
			this.custPhoneNumber = custPhoneNumber;
		}
		public String getCustMobileNumber() {
			return custMobileNumber;
		}
		public void setCustMobileNumber(String custMobileNumber) {
			this.custMobileNumber = custMobileNumber;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustAddress1() {
			return custAddress1;
		}
		public void setCustAddress1(String custAddress1) {
			this.custAddress1 = custAddress1;
		}
		public String getCustAddress2() {
			return custAddress2;
		}
		public void setCustAddress2(String custAddress2) {
			this.custAddress2 = custAddress2;
		}
		public String getCustAddress3() {
			return custAddress3;
		}
		public void setCustAddress3(String custAddress3) {
			this.custAddress3 = custAddress3;
		}
		public String getCustCity() {
			return custCity;
		}
		public void setCustCity(String custCity) {
			this.custCity = custCity;
		}
		public String getCustZipCode() {
			return custZipCode;
		}
		public void setCustZipCode(String custZipCode) {
			this.custZipCode = custZipCode;
		}
		public String getCustNotes() {
			return custNotes;
		}
		public void setCustNotes(String custNotes) {
			this.custNotes = custNotes;
		}
		public String getCustArea() {
			return custArea;
		}
		public void setCustArea(String custArea) {
			this.custArea = custArea;
		}
		public String getCustStatus() {
			return custStatus;
		}
		public void setCustStatus(String custStatus) {
			this.custStatus = custStatus;
		}
	}
	
	public class CustomerPIC{
	    public String custPicName;
	    public int custPicSeq;
	    public String custPicRemarks;
	    
		public String getCustPicName() {
			return custPicName;
		}
		public void setCustPicName(String custPicName) {
			this.custPicName = custPicName;
		}
		public int getCustPicSeq() {
			return custPicSeq;
		}
		public void setCustPicSeq(int custPicSeq) {
			this.custPicSeq = custPicSeq;
		}
		public String getCustPicRemarks() {
			return custPicRemarks;
		}
		public void setCustPicRemarks(String custPicRemarks) {
			this.custPicRemarks = custPicRemarks;
		}
	}
    
	public class DataBill{
	    public String billNumber;
	    public String ccNumber;
	    public String billDate;
	    public String billTime;
	    public String agentCode;
	    public int totalItem;
	    public String totalAmount;
	    public String totalRounding;
	    public String totalCharge;
	    public String totalTax;
	    public String totalSales;
	    public String totalPayment;
	    public String totalTaxCharge;
	    public List<ListItem> listItem;
	    
		public String getBillNumber() {
			return billNumber;
		}
		public void setBillNumber(String billNumber) {
			this.billNumber = billNumber;
		}
		public String getCcNumber() {
			return ccNumber;
		}
		public void setCcNumber(String ccNumber) {
			this.ccNumber = ccNumber;
		}
		public String getBillDate() {
			return billDate;
		}
		public void setBillDate(String billDate) {
			this.billDate = billDate;
		}
		public String getBillTime() {
			return billTime;
		}
		public void setBillTime(String billTime) {
			this.billTime = billTime;
		}
		public String getAgentCode() {
			return agentCode;
		}
		public void setAgentCode(String agentCode) {
			this.agentCode = agentCode;
		}
		public int getTotalItem() {
			return totalItem;
		}
		public void setTotalItem(int totalItem) {
			this.totalItem = totalItem;
		}
		public String getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getTotalRounding() {
			return totalRounding;
		}
		public void setTotalRounding(String totalRounding) {
			this.totalRounding = totalRounding;
		}
		public String getTotalCharge() {
			return totalCharge;
		}
		public void setTotalCharge(String totalCharge) {
			this.totalCharge = totalCharge;
		}
		public String getTotalTax() {
			return totalTax;
		}
		public void setTotalTax(String totalTax) {
			this.totalTax = totalTax;
		}
		public String getTotalSales() {
			return totalSales;
		}
		public void setTotalSales(String totalSales) {
			this.totalSales = totalSales;
		}
		public String getTotalPayment() {
			return totalPayment;
		}
		public void setTotalPayment(String totalPayment) {
			this.totalPayment = totalPayment;
		}
		public String getTotalTaxCharge() {
			return totalTaxCharge;
		}
		public void setTotalTaxCharge(String totalTaxCharge) {
			this.totalTaxCharge = totalTaxCharge;
		}
		public List<ListItem> getListItem() {
			return listItem;
		}
		public void setListItem(List<ListItem> listItem) {
			this.listItem = listItem;
		}
	}
	
	public static class ListItem {
	    public int itemSeq;
	    public String menuItemCode;
	    public int itemQty;
	    public String amount;
	    public String transType;
	    public String amountTax;
	    public List<ListItemDetail> listItemDetail;
	    
		public int getItemSeq() {
			return itemSeq;
		}
		public void setItemSeq(int itemSeq) {
			this.itemSeq = itemSeq;
		}
		public String getMenuItemCode() {
			return menuItemCode;
		}
		public void setMenuItemCode(String menuItemCode) {
			this.menuItemCode = menuItemCode;
		}
		public int getItemQty() {
			return itemQty;
		}
		public void setItemQty(int itemQty) {
			this.itemQty = itemQty;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getTransType() {
			return transType;
		}
		public void setTransType(String transType) {
			this.transType = transType;
		}
		public String getAmountTax() {
			return amountTax;
		}
		public void setAmountTax(String amountTax) {
			this.amountTax = amountTax;
		}
		public List<ListItemDetail> getListItemDetail() {
			return listItemDetail;
		}
		public void setListItemDetail(List<ListItemDetail> listItemDetail) {
			this.listItemDetail = listItemDetail;
		}
	}
	
	public static class ListItemDetail {
	    public String menuItemCode;
	    public int itemSeq;
	    public int itemQty;
	    public String itemType;
	    public String originalItemCode;
	    public String modifierGroupCode;
	    public String amount;		
	    public String amountTax;
	    
		public String getMenuItemCode() {
			return menuItemCode;
		}
		public void setMenuItemCode(String menuItemCode) {
			this.menuItemCode = menuItemCode;
		}
		public int getItemSeq() {
			return itemSeq;
		}
		public void setItemSeq(int itemSeq) {
			this.itemSeq = itemSeq;
		}
		public int getItemQty() {
			return itemQty;
		}
		public void setItemQty(int itemQty) {
			this.itemQty = itemQty;
		}
		public String getItemType() {
			return itemType;
		}
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		public String getOriginalItemCode() {
			return originalItemCode;
		}
		public void setOriginalItemCode(String originalItemCode) {
			this.originalItemCode = originalItemCode;
		}
		public String getModifierGroupCode() {
			return modifierGroupCode;
		}
		public void setModifierGroupCode(String modifierGroupCode) {
			this.modifierGroupCode = modifierGroupCode;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getAmountTax() {
			return amountTax;
		}
		public void setAmountTax(String amountTax) {
			this.amountTax = amountTax;
		}
	}
	
	public static class DataPayment {
	    public int paySeq;
	    public String paymentMethodeCode;
	    public String paymentAmount;
	    public String paymentUsed;
	    public String reffNo;
	    
		public int getPaySeq() {
			return paySeq;
		}
		public void setPaySeq(int paySeq) {
			this.paySeq = paySeq;
		}
		public String getPaymentMethodeCode() {
			return paymentMethodeCode;
		}
		public void setPaymentMethodeCode(String paymentMethodeCode) {
			this.paymentMethodeCode = paymentMethodeCode;
		}
		public String getPaymentAmount() {
			return paymentAmount;
		}
		public void setPaymentAmount(String paymentAmount) {
			this.paymentAmount = paymentAmount;
		}
		public String getPaymentUsed() {
			return paymentUsed;
		}
		public void setPaymentUsed(String paymentUsed) {
			this.paymentUsed = paymentUsed;
		}
		public String getReffNo() {
			return reffNo;
		}
		public void setReffNo(String reffNo) {
			this.reffNo = reffNo;
		}
	}
}
