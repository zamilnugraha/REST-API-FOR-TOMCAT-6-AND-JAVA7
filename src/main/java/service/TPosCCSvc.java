package service;

public interface TPosCCSvc {
	
	public String updateStatus(String deliveryStatus, String billNo);
	
	public String updateStatusScheduler(String flagOnline);
}
