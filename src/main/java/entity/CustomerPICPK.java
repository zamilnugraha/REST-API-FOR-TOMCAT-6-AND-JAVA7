package entity;

import java.io.Serializable;

public class CustomerPICPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double custPicSeq;
	
	public double getCustPicSeq() {
		return custPicSeq;
	}
	public void setCustPicSeq(double custPicSeq) {
		this.custPicSeq = custPicSeq;
	}
	
}
