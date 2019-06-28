package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.TPosCCDao;
import service.TPosCCSvc;

@Service("tPosSvc")
@Transactional
public class TPosCCSvcImpl implements TPosCCSvc {

	@Autowired
	TPosCCDao tPosCCDao;

	@Override
	public String updateStatus(String deliveryStatus, String billNo) {
		String resultStatus = "";
		try {

			resultStatus = String.valueOf(tPosCCDao.updateStatus(deliveryStatus, billNo));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Update Status : " + e.getMessage());
		}
		return resultStatus;
	}

	@Override
	public String updateStatusScheduler(String flagOnline) {
		String resultStatus = "";
		try {

			resultStatus = String.valueOf(tPosCCDao.updateStatusScheduler(flagOnline));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Update Status : " + e.getMessage());
		}
		return resultStatus;
	}

}
