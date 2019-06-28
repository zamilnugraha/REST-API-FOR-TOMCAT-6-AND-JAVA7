package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entity.TPosCC;
import entity.TPosCCPK;

@Repository
public interface TPosCCDao extends JpaRepository<TPosCC, TPosCCPK> {

	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE t_pos_cc SET DELIVERY_STATUS = ? WHERE CC_NO = ?", nativeQuery = true)
	public Integer updateStatus(String deliveryStatus, String billNo);

	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE t_pos_cc SET FLAG_ONLINE = ? WHERE FLAG_ONLINE = 'P' "
			+ "AND DATE_FORMAT(DATE_UPD, '%Y-%m-%d')= CURDATE() "
			+ "AND (TIME(NOW()) - TIME(DATE_UPD) > 3)", nativeQuery = true)
	public Integer updateStatusScheduler(String flagOnline);

}
