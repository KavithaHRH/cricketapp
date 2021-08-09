package com.cricapp.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricapp.entities.MatchCalender;
import com.cricapp.entities.MatchCalenderList;
import com.cricapp.service.MatchCalenderService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MatchCalenderController {
	private MatchCalenderService matchCalenderService;
	
	@Autowired
	public MatchCalenderController(MatchCalenderService matchCalenderService) {
		this.matchCalenderService=matchCalenderService;
	}
	@GetMapping("matchcalender")
	public MatchCalenderList getAll(){
		MatchCalenderList List=new MatchCalenderList();
		List.setMatchcalenderList(matchCalenderService.getAll());
	   return List;
	}
	@GetMapping("matchcalender/{id}")
	public MatchCalender getAnMatchCalender(@PathVariable("id")int matchCalenderId){
	   return matchCalenderService.getMatchCalenderById(matchCalenderId);
	}
	@DeleteMapping("matchcalender/{id}")
	public MatchCalender deleteAnMatchCalender(@PathVariable("id")int upmatchId){
		   return matchCalenderService.delete(upmatchId);
    }
	
	@PostMapping("matchcalender")
	public MatchCalender addAnMatchCalender(@RequestBody MatchCalender upmatch ){
		   return matchCalenderService.save(upmatch);
    }
	
	
	
	
}
