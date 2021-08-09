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

import com.cricapp.entities.CricketScore;
import com.cricapp.service.CricketScoreService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CricketScoreController {
	private CricketScoreService cricketScoreService;
	@Autowired
	public CricketScoreController(CricketScoreService cricketScoreService) {
		this.cricketScoreService=cricketScoreService;
	}
	@GetMapping("cricketscore")
	public List<CricketScore> getAll(){
	   return cricketScoreService.getAll();
	}
	@GetMapping("cricketscore/{id}")
	public CricketScore getAnCricketScore(@PathVariable("id")int cricketScoreId){
	   return cricketScoreService.getCricketScoreById(cricketScoreId);
	}
	@DeleteMapping("cricketscore/{id}")
	public CricketScore deleteAnCricketScore(@PathVariable("id")int cricketscoreId){
		   return cricketScoreService.delete(cricketscoreId);
    }
	
	@PostMapping("cricketscore")
	public CricketScore addAnCricketScore(@RequestBody CricketScore cricketscore ){
		   return cricketScoreService.save(cricketscore);
    }
	
	
	
	
}
