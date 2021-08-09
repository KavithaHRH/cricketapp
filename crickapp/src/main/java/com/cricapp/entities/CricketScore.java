package com.cricapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="table4")
@NoArgsConstructor


public class CricketScore{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int matchId;
private String name;
private String team1;
private String team2;
private int innings;
private int score;
public CricketScore(String name, String team1, String team2, int innings, int score) {
	super();
	this.name = name;
	this.team1 = team1;
	this.team2 = team2;
	this.innings = innings;
	this.score = score;
}
public int getMatchId() {
	return matchId;
}
public void setMatchId(int matchId) {
	this.matchId = matchId;
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
public int getInnings() {
	return innings;
}
public void setInnings(int innings) {
	this.innings = innings;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public CricketScore() {
	super();
	// TODO Auto-generated constructor stub
}

}

