package com.cricapp.service;

import java.util.List;

import com.cricapp.entities.MatchCalender;

public interface MatchCalenderService {
public List<MatchCalender> getAll();
public MatchCalender getMatchCalenderById(int upcomingMatchId);
public MatchCalender save(MatchCalender matchcalender);
public MatchCalender delete(int matchcalenderId);
public MatchCalender update(int matchcalenderId, MatchCalender matchcalender);
}