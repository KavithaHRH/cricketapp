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

import com.cricapp.entities.OldMatch;
import com.cricapp.service.OldMatchService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OldMatchController {
	private OldMatchService oldMatchService;
	@Autowired
	public OldMatchController(OldMatchService oldMatchService) {
		this.oldMatchService=oldMatchService;
	}
	@GetMapping("oldmatch")
	public List<OldMatch> getAll(){
	   return oldMatchService.getAll();
	}
	@GetMapping("oldmatch/{id}")
	public OldMatch getAnOldMatch(@PathVariable("id")int oldMatchId){
	   return oldMatchService.getOldMatchById(oldMatchId);
	}
	@DeleteMapping("oldmatch/{id}")
	public OldMatch deleteAnOldMatch(@PathVariable("id")int oldmatchId){
		   return oldMatchService.delete(oldmatchId);
    }
	
	@PostMapping("oldmatch")
	public OldMatch addAnOldMatch(@RequestBody OldMatch oldmatch ){
		   return oldMatchService.save(oldmatch);
    }
	
	
	
	
}
