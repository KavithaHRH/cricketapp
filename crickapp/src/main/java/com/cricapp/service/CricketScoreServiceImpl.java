package com.cricapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricapp.entities.CricketScore;
import com.cricapp.repo.CricketScoreRepo;
@Service
@Transactional
public class CricketScoreServiceImpl implements CricketScoreService{
	@Autowired
	private CricketScoreRepo cricketScoreRepo;

	@Override
	public List<CricketScore> getAll() {
	
		return  cricketScoreRepo.findAll();
	}

	@Override
	public CricketScore getCricketScoreById(int cricketScoreId) {
		return cricketScoreRepo.findById(cricketScoreId).orElseThrow(CricketScoreNotFoundException:: new);
	}


	@Override
	public CricketScore save(CricketScore cricketscore) {
		return cricketScoreRepo.save(cricketscore) ;
	}

	@Override
	public CricketScore delete(int cricketscoreId) {
	CricketScore cricketscoreToDelete=getCricketScoreById(cricketscoreId);
	cricketScoreRepo.delete(cricketscoreToDelete);
	return cricketscoreToDelete;
	}
	@Override
	public CricketScore update(int cricketscoreId, CricketScore cricketscore) {
	CricketScore cricketscoreToUpdate=getCricketScoreById(cricketscoreId);
	return cricketScoreRepo.save(cricketscoreToUpdate);
	}

}
