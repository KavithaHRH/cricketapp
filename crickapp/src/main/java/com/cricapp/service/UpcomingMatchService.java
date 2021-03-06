package com.cricapp.service;

import java.util.List;

import com.cricapp.entities.UpcomingMatch;

public interface UpcomingMatchService {
public List<UpcomingMatch> getAll();
public UpcomingMatch getUpcomingMatchById(int upcomingMatchId);
public UpcomingMatch save(UpcomingMatch upmatch);
public UpcomingMatch delete(int upmatchId);
public UpcomingMatch update(int upmatchId, UpcomingMatch upmatch);
}