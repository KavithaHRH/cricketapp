package com.cricapp.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="table3")
@Getter
@Setter
@NoArgsConstructor


public class MatchCalender{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int MatchCalenderId;
private String name;
private Date date;
public MatchCalender(String name, Date date) {
	super();
	this.name = name;
	this.date = date;
}
}


