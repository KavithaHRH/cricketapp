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

import com.cricapp.entities.UpcomingMatch;
import com.cricapp.entities.UpcomingMatchList;
import com.cricapp.service.UpcomingMatchService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UpcomingMatchController {
	private UpcomingMatchService upcomingMatchService;
	
	@Autowired
	public UpcomingMatchController(UpcomingMatchService upcomingMatchService) {
		this.upcomingMatchService=upcomingMatchService;
	}
	@GetMapping("upcomingmatch")
	public UpcomingMatchList getAll(){
		UpcomingMatchList List=new UpcomingMatchList();
		List.setUpcomingmatchList(upcomingMatchService.getAll());
	   return List;
	}
	@GetMapping("upcomingmatch/{id}")
	public UpcomingMatch getAnUpcomingMatch(@PathVariable("id")int upcomingMatchId){
	   return upcomingMatchService.getUpcomingMatchById(upcomingMatchId);
	}
	@DeleteMapping("upcomingmatch/{id}")
	public UpcomingMatch deleteAnUpcomingMatch(@PathVariable("id")int upmatchId){
		   return upcomingMatchService.delete(upmatchId);
    }
	
	@PostMapping("upcomingmatch")
	public UpcomingMatch addAnUpcomingMatch(@RequestBody UpcomingMatch upmatch ){
		   return upcomingMatchService.save(upmatch);
    }
	
	
	
	
}
