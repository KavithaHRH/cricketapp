package com.cricapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricapp.entities.OldMatch;

public interface OldMatchRepo extends JpaRepository<OldMatch, Integer>{
	public OldMatch findByTitle(String title);
}
