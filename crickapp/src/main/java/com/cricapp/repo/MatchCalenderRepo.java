package com.cricapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricapp.entities.MatchCalender;

public interface MatchCalenderRepo extends JpaRepository<MatchCalender, Integer>{
	public MatchCalender findByName(String name);
}
