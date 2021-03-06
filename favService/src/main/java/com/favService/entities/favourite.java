package com.favService.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class favourite {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String favListId;
	private int matchId;
	private int userId;
	private String userName;
	private String favDate;
	private OldMatch oldMatch;
	public favourite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFavListId() {
		return favListId;
	}
	public void setFavListId(String favListId) {
		this.favListId = favListId;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFavDate() {
		return favDate;
	}
	public void setFavDate(String favDate) {
		this.favDate = favDate;
	}
	public OldMatch getOldMatch() {
		return oldMatch;
	}
	public void setOldMatch(OldMatch oldMatch) {
		this.oldMatch = oldMatch;
	}
	
}



