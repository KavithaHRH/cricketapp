package com.cricapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricapp.entities.MatchCalender;
import com.cricapp.repo.MatchCalenderRepo;
@Service
@Transactional
public class MatchCalenderServiceImpl implements MatchCalenderService{
	@Autowired
	private MatchCalenderRepo matchCalenderRepo;

	@Override
	public List<MatchCalender> getAll() {
	
		return  matchCalenderRepo.findAll();
	}

	@Override
	public MatchCalender getMatchCalenderById(int matchCalenderId) {
		return matchCalenderRepo.findById(matchCalenderId).orElseThrow(MatchCalenderNotFoundException:: new);
	}


	@Override
	public MatchCalender save(MatchCalender matchcalender) {
		return matchCalenderRepo.save(matchcalender) ;
	}

	@Override
	public MatchCalender delete(int matchcalenderId) {
	MatchCalender matchcalenderToDelete=getMatchCalenderById(matchcalenderId);
	matchCalenderRepo.delete(matchcalenderToDelete);
	return matchcalenderToDelete;
	}
	@Override
	public MatchCalender update(int matchcalenderId, MatchCalender matchcalender) {
	MatchCalender matchcalenderToUpdate=getMatchCalenderById(matchcalenderId);
	return matchCalenderRepo.save(matchcalenderToUpdate);
	}

}
