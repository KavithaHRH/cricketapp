package com.cricapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricapp.entities.OldMatch;
import com.cricapp.repo.OldMatchRepo;
@Service
@Transactional
public class OldMatchServiceImpl implements OldMatchService{
	@Autowired
	private OldMatchRepo oldMatchRepo;

	@Override
	public List<OldMatch> getAll() {
	
		return  oldMatchRepo.findAll();
	}

	@Override
	public OldMatch getOldMatchById(int oldMatchId) {
		return oldMatchRepo.findById(oldMatchId).orElseThrow(OldMatchNotFoundException:: new);
	}


	@Override
	public OldMatch save(OldMatch oldmatch) {
		return oldMatchRepo.save(oldmatch) ;
	}

	@Override
	public OldMatch delete(int oldmatchId) {
	OldMatch oldmatchToDelete=getOldMatchById(oldmatchId);
	oldMatchRepo.delete(oldmatchToDelete);
	return oldmatchToDelete;
	}
	@Override
	public OldMatch update(int oldmatchId, OldMatch oldmatch) {
	OldMatch oldmatchToUpdate=getOldMatchById(oldmatchId);
	return oldMatchRepo.save(oldmatchToUpdate);
	}

}
