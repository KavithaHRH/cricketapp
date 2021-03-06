package com.cricapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricapp.entities.UpcomingMatch;
import com.cricapp.repo.UpcomingMatchRepo;
@Service
@Transactional
public class UpcomingMatchServiceImpl implements UpcomingMatchService{
	@Autowired
	private UpcomingMatchRepo upcomingMatchRepo;

	@Override
	public List<UpcomingMatch> getAll() {
	
		return  upcomingMatchRepo.findAll();
	}

	@Override
	public UpcomingMatch getUpcomingMatchById(int upcomingMatchId) {
		return upcomingMatchRepo.findById(upcomingMatchId).orElseThrow(UpcomingMatchNotFoundException:: new);
	}


	@Override
	public UpcomingMatch save(UpcomingMatch upmatch) {
		return upcomingMatchRepo.save(upmatch) ;
	}

	@Override
	public UpcomingMatch delete(int upmatchId) {
	UpcomingMatch upcomingmatchToDelete=getUpcomingMatchById(upmatchId);
	upcomingMatchRepo.delete(upcomingmatchToDelete);
	return upcomingmatchToDelete;
	}
	@Override
	public UpcomingMatch update(int upmatchId, UpcomingMatch upmatch) {
	UpcomingMatch upcomingmatchToUpdate=getUpcomingMatchById(upmatchId);
	return upcomingMatchRepo.save(upcomingmatchToUpdate);
	}

}
