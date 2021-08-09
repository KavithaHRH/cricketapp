package com.cricapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="table1")


public class UpcomingMatch implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int upcomingMatchId;
private String name;
private String team1;
private String team2;
private String date;
public UpcomingMatch(String name, String team1, String team2, String date) {
	super();
	this.name = name;
	this.team1 = team1;
	this.team2 = team2;
	this.date = date;
	
}
public int getUpcomingMatchId() {
	return upcomingMatchId;
}
public void setUpcomingMatchId(int upcomingMatchId) {
	this.upcomingMatchId = upcomingMatchId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeam1() {
	return team1;
}
public void setTeam1(String team1) {
	this.team1 = team1;
}
public String getTeam2() {
	return team2;
}
public void setTeam2(String team2) {
	this.team2 = team2;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public UpcomingMatch() {
	super();
	// TODO Auto-generated constructor stub
}

}

