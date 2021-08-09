package com.cricapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricapp.entities.UpcomingMatch;

@Repository
public interface UpcomingMatchRepo extends JpaRepository<UpcomingMatch, Integer>{
    public UpcomingMatch findByName(String name);
   
}
