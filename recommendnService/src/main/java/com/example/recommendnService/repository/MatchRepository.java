package com.example.recommendnService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.model.UpcomingMatch;

@Repository
public interface MatchRepository extends MongoRepository<UpcomingMatch , String> {
	public  UpcomingMatch findByName(String name);
	public List<UpcomingMatch> findByTeam1(String teamName);
	public List<UpcomingMatch> findByTeam2(String teamName);
	public List<UpcomingMatch> findAllByName(String name);

}
