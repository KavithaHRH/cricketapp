package com.example.userApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.userApi.entities.UpcomingMatch;



@RestController
public class UpcomingMatchController {
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("upcomingmatch")
	
	public UpcomingMatchList getUpcomingMatch() {
		UpcomingMatchList upcomingMatchList=restTemplate
				.getForObject("http://localhost:8081/cicketmatch/upcomingmatch", UpcomingMatchList.class);
		return upcomingMatchList;
		//return new UpcomingMatch("htdj", "trhj", "hdt", "3409");
		}
	
}	
