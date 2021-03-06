package com.favService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.favService.entities.OldMatch;

import com.favService.dto.favRequest;
import com.favService.entities.favourite;

@RestController
public class FavRestController {
	@Autowired
	private RestTemplate restTemplate;
	//matchid matchtitle
	@GetMapping(path="fav")
	public ResponseEntity<favourite> submitfavourite(@RequestParam("matchid")int matchid,
			@RequestParam("matchtitle")String matchtitle){
			String oldMatchUrl = "http://localhost:8081/cicketmatch/oldmatch/1";
		OldMatch oldMatch=restTemplate.getForObject(oldMatchUrl, OldMatch.class);
		
		favourite favo=new favourite();
		favo.setFavListId("11");
		favo.setMatchId(1);
 	    favo.setOldMatch(oldMatch);
		favo.setFavDate("26/02/2010");
		favo.setUserId(1);
		favo.setUserName("sam");
		return ResponseEntity.ok(favo);

	}
	
	//	return ResponseEntity.status(HttpStatus.CREATED).body(favo);
	
	
	

	}


