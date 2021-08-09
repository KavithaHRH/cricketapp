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
@Table(name="table2")
@NoArgsConstructor


public class OldMatch {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int oldMatchId;
private String description;
private String title;
public OldMatch(String description, String title) {
	super();
	this.description = description;
	this.title = title;
}
public int getOldMatchId() {
	return oldMatchId;
}
public void setOldMatchId(int oldMatchId) {
	this.oldMatchId = oldMatchId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public OldMatch() {
	super();
	// TODO Auto-generated constructor stub
}

}


