package common;

import java.io.Serializable;

public class RestResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean status;	
	private String message;
	public RestResponse() {
		// TODO Auto-generated constructor stub
	}
		
	public RestResponse(boolean status, String message){
		this.status = status;
		this.message = message;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
