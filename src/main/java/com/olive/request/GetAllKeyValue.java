package com.olive.request;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetAllKeyValue{
	
	@Scheduled(cron = "10 * * * * *")
	public void updateKey() {
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> req=new HttpEntity<String>("{}", header); 
		String resp=new RestTemplate()
		.postForObject(
				"http://localhost:9898/actuator/refresh", 
				req, String.class);
		
		System.out.println("UPDATED KEYS " + resp);
	}
	
}
