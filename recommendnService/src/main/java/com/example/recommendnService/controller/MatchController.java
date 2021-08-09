package com.example.recommendnService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.recommendnService.model.UpcomingMatch;
import com.example.recommendnService.service.RecommendationService;


@RestController
@Api
//@RequestMapping("/api/home")
public class MatchController {
	
		@Autowired
		RecommendationService service;

		@GetMapping("/match/name")
		@ApiOperation(value = "get the recomendations by match name")
		public ResponseEntity<?> findbyName(@PathVariable String name){
			try {
				UpcomingMatch list = service.findByName(name);
				return new ResponseEntity<UpcomingMatch>(list, HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		
		@GetMapping("/teamname/teamName")
		@ApiOperation(value = "get the recomendations by team name")
		public ResponseEntity<?> findbyTeam(@PathVariable String team){
			try {
				List<UpcomingMatch> list = service.findbyTeam(team);
				return new ResponseEntity<List<UpcomingMatch>>(list, HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		
		@PutMapping("/newEntry")
		@ApiOperation(value = "get the recomendations by team name")
		public ResponseEntity<?> newEntry(@RequestBody UpcomingMatch match){
			try {
				boolean list = service.newEntry(match);
				return new ResponseEntity<Boolean>(list, HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}

}
