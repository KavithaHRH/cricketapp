package com.example.recommendnService.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.model.UpcomingMatch;
import com.stackroute.repository.MatchRepository;

@Service
public class RecommendationServiceImpl implements RecommendationService {

	@Autowired
	MatchRepository matchRepo;
	
	@Override
	public UpcomingMatch findByName(String name) {
		try {

		
		UpcomingMatch list = matchRepo.findByName(name);
		return list;
		}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<UpcomingMatch> findbyTeam(String team) {
		try {
			List<UpcomingMatch> team1 = matchRepo.findByTeam1(team);
			List<UpcomingMatch> team2 = matchRepo.findByTeam2(team);
			if(team1 != null) {
				return team1;
			}
			else if(team2 != null) {
				return team2;
			}
			else {
				throw new Exception("no match found");
			}
			}
			catch(Exception e) {
				return null;
			}
	
	}

	@Override
	public boolean newEntry(UpcomingMatch match) {
		matchRepo.save(match);
		return true;
	}

}
