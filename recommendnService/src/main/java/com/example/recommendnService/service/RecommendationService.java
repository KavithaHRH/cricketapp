package com.example.recommendnService.service;

import java.util.List;

import com.stackroute.model.UpcomingMatch;

public interface RecommendationService {

	public  UpcomingMatch findByName  (String name);
	public  List<UpcomingMatch> findbyTeam(String team);
	boolean newEntry(UpcomingMatch match);
	
}
