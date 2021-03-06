package com.favService.sevice;
import java.util.List;

import com.favService.entities.OldMatch;


public interface OldMatchService {
	public List<OldMatch> getAll();
	public OldMatch getOldMatchById(int OldMatchId);
	public OldMatch save(OldMatch oldmatch);
	public OldMatch delete(int oldmatchId);
	public OldMatch update(int oldmatchId, OldMatch oldmatch);

}
