package com.cricapp.service;
import java.util.List;

import com.cricapp.entities.OldMatch;
public interface OldMatchService {
	public List<OldMatch> getAll();
	public OldMatch getOldMatchById(int OldMatchId);
	public OldMatch save(OldMatch oldmatch);
	public OldMatch delete(int oldmatchId);
	public OldMatch update(int oldmatchId, OldMatch oldmatch);

}
