package com.cricapp.service;

import java.util.List;

import com.cricapp.entities.CricketScore;

public interface CricketScoreService {
public List<CricketScore> getAll();
public CricketScore getCricketScoreById(int cricketScoreId);
public CricketScore save(CricketScore cricketscore);
public CricketScore delete(int cricketscoreId);
public CricketScore update(int cricketscoreId, CricketScore cricketscore);
}