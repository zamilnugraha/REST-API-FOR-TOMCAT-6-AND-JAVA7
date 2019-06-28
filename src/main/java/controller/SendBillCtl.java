package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import dto.SendBillDto;
import service.TPosCCSvc;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author Indocyber Global Teknologi/IGLO KFC Team ( Zamil Nugraha )
 */

@RestController
@EnableScheduling
public class SendBillCtl {

	static Logger logger = LoggerFactory.getLogger(SendBillCtl.class);

	@Autowired
	TPosCCSvc tposCCSvc;

	@RequestMapping(value = "sendOrder", method = RequestMethod.POST)
	public String SendBill(@RequestBody SendBillDto outlet,
			@RequestParam(value = "outletIp", required = false) String outletIp,
			@RequestParam(value = "outletPort", required = false) String outletPort) {
		String result = "";
		String base_url = "";
		final long NANOSEC_PER_SEC = 1000l * 1000 * 1000;
		long startTime = System.nanoTime();
		long oneMinutes = 2 * 60 * NANOSEC_PER_SEC;
		boolean isSuccesCallRest = false;

		while (((System.nanoTime() - startTime) < oneMinutes) && !isSuccesCallRest) {
			try {
				base_url = "http://" + outletIp + ":" + outletPort + "/api-hd/order";

				Gson gson = new Gson();
				HttpClient client = HttpClientBuilder.create().build();
				HttpPost post = new HttpPost(base_url);
				StringEntity postString = new StringEntity(gson.toJson(outlet));
				post.setEntity(postString);
				post.setHeader("Content-type", "application/json");
				HttpResponse responsess = client.execute(post);

				BufferedReader br = new BufferedReader(new InputStreamReader((responsess.getEntity().getContent())));
				StringBuilder content = new StringBuilder();
				String line;
				while (null != (line = br.readLine())) {
					content.append(line);
				}
				
				result = content.toString();

				Map<String, Object> statusOrder = gson.fromJson(result, new TypeToken<Map<String, Object>>() {
				}.getType());
				
				if (statusOrder.get("status").equals(true) || statusOrder.get("status").equals(false)) {
					isSuccesCallRest = true;
				}

			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				logger.error(errors.toString());
			}
		}
		return result;
	}

	@RequestMapping(value = "updateStatus", method = RequestMethod.GET)
	public RestResponse updateStatus(@RequestParam(value = "BILL_NO", required = false) String billNo,
			@RequestParam(value = "DELIVERY_STATUS", required = false) String deliveryStatus) {
		RestResponse restResponse = new RestResponse();

		try {
			String data = tposCCSvc.updateStatus(deliveryStatus, billNo);

			if (data.equalsIgnoreCase("1")) {
				restResponse.setMessage("Berhasil update status order");
				restResponse.setStatus(true);
			} else {
				restResponse.setMessage("Gagal update status order");
				restResponse.setStatus(false);
			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
		}
		return restResponse;
	}

	@Scheduled(cron = "0 */3 * * * ?")
	public void fixedDelaySch() {
		String scheduler = tposCCSvc.updateStatusScheduler("N");

		if (scheduler.equalsIgnoreCase("1")) {
			System.out.println("Berhasil update Flag Online");
		} else {
			System.out.println("Gagal update Flag Online");
		}
	}

}
